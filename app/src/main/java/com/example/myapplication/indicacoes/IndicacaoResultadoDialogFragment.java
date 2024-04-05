package com.example.myapplication.indicacoes;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.myapplication.R;

public class IndicacaoResultadoDialogFragment extends DialogFragment
{

    private String mensagemResultado;

    public IndicacaoResultadoDialogFragment(String mensagemResultado)
    {
        this.mensagemResultado = mensagemResultado;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState)
    {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.setContentView(R.layout.dialog_indicacao_resultado);
        dialog.setCancelable(false);

        TextView tvIndicacaoResultado = dialog.findViewById(R.id.tvIndicacaoResultado);
        tvIndicacaoResultado.setText(mensagemResultado);

        Button btnFecharModal = dialog.findViewById(R.id.btnFecharModal);
        btnFecharModal.setOnClickListener(v -> dismiss());

        return dialog;
    }
}
