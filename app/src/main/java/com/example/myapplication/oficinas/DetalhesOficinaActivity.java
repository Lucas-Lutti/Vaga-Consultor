package com.example.myapplication.oficinas;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.principal.MainActivity;

public class DetalhesOficinaActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalhes_oficina);

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TextView nomeOficina = findViewById(R.id.nome_oficina);
        TextView descricaoCurtaOficina = findViewById(R.id.descricao_curta_oficina);
        TextView enderecoOficina = findViewById(R.id.endereco_oficina);
        TextView telefoneOficina = findViewById(R.id.telefone_oficina);
        TextView emailOficina = findViewById(R.id.email_oficina);

        Oficina oficina = (Oficina) getIntent().getSerializableExtra("oficina");

        if (oficina != null)
        {
            nomeOficina.setText(oficina.getNome());
            descricaoCurtaOficina.setText(oficina.getDescricaoCurta());
            enderecoOficina.setText(oficina.getEndereco());
            telefoneOficina.setText(String.format("Tel: %s / %s", oficina.getTelefone1(), oficina.getTelefone2()));
            emailOficina.setText(String.format("Email: %s", oficina.getEmail()));
        } else {
            // Tratar caso não haja dados de oficina com alguma mensagem ou ação
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == android.R.id.home)
        {
            Intent homeIntent = new Intent(this, MainActivity.class);
            homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(homeIntent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
