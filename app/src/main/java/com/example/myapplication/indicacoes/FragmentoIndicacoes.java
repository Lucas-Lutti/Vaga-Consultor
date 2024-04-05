package com.example.myapplication.indicacoes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.example.myapplication.R;
import com.example.myapplication.api.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentoIndicacoes extends Fragment
{
    private EditText editTextNomeAmigo;
    private EditText editTextTelefoneAmigo;
    private EditText editTextEmailAmigo;
    private Button buttonEnviarIndicacao;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_indicacoes, container, false);
        editTextNomeAmigo = view.findViewById(R.id.editTextNomeAmigo);
        editTextTelefoneAmigo = view.findViewById(R.id.editTextTelefoneAmigo);
        editTextEmailAmigo = view.findViewById(R.id.editTextEmailAmigo);
        buttonEnviarIndicacao = view.findViewById(R.id.buttonEnviarIndicacao);

        buttonEnviarIndicacao.setOnClickListener(v -> enviarIndicacao());

        return view;
    }

    private void enviarIndicacao()
    {
        String nomeAmigo = editTextNomeAmigo.getText().toString().trim();
        String telefoneAmigo = editTextTelefoneAmigo.getText().toString().trim();
        String emailAmigo = editTextEmailAmigo.getText().toString().trim();

        if (nomeAmigo.isEmpty() || telefoneAmigo.isEmpty() || emailAmigo.isEmpty())
        {
            if (nomeAmigo.isEmpty())
            {
                editTextNomeAmigo.setError("Este campo é obrigatório");
            }
            if (telefoneAmigo.isEmpty())
            {
                editTextTelefoneAmigo.setError("Este campo é obrigatório");
            }
            if (emailAmigo.isEmpty())
            {
                editTextEmailAmigo.setError("Este campo é obrigatório");
            }
            return;
        }

        EntradaIndicacao entradaIndicacao = new EntradaIndicacao();

        Indicacao indicacao = new Indicacao();
        indicacao.setNomeAmigo(nomeAmigo);
        indicacao.setTelefoneAmigo(telefoneAmigo);
        indicacao.setEmailAmigo(emailAmigo);
        indicacao.setCodigoAssociacao("601");
        indicacao.setCpfAssociado("1234");
        indicacao.setDataCriacao("hoje");
        indicacao.setEmailAssociado("asdfasdfa");
        indicacao.setNomeAssociado("asdfasdfa");
        indicacao.setPlacaVeiculoAssociado("asdfasdfa");
        indicacao.setTelefoneAssociado("13443");
        indicacao.setTelefoneAssociado("13443");

        entradaIndicacao.setIndicacao(indicacao);
        entradaIndicacao.setRemetente("seuemail@example.com");
        entradaIndicacao.setCopias(new String[]{"outroemail@example.com"});


        RepositorioIndicacao repositorioIndicacao = new RepositorioIndicacao();
        repositorioIndicacao.enviarIndicacao(entradaIndicacao.getIndicacao(), new Callback<RespostaIndicacao>()
        {
            @Override
            public void onResponse(Call<RespostaIndicacao> call, Response<RespostaIndicacao> response)
            {
                if (response.isSuccessful() && response.body().equals("Indicacao enviada com sucesso!"))
                {
                    String mensagemSucesso = response.body().getSucesso();
                    mostrarDialog(mensagemSucesso);
                } else
                {
                    mostrarDialog("Erro no envio da indicação");
                }
            }

            @Override
            public void onFailure(Call<RespostaIndicacao> call, Throwable t)
            {
                mostrarDialog("Falha na comunicação com a API"+ t);
            }

        });
    }

    private void mostrarDialog(String mensagem)
    {
        IndicacaoResultadoDialogFragment dialogFragment = new IndicacaoResultadoDialogFragment(mensagem);
        dialogFragment.show(getParentFragmentManager(), "indicacaoResultado");
    }
}
