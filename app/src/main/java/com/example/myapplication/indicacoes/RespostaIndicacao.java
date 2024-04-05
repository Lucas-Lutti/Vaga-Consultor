package com.example.myapplication.indicacoes;

import com.example.myapplication.api.RetornoErro;
import com.google.gson.annotations.SerializedName;

public class RespostaIndicacao
{
    @SerializedName("RetornoErro")
    private RetornoErro retornoErro;

    @SerializedName("Sucesso")
    private String sucesso;

    public RetornoErro getRetornoErro()
    { // Tipo alterado para RetornoErro
        return retornoErro;
    }

    public String getSucesso()
    {
        return sucesso;
    }

    public void setRetornoErro(RetornoErro retornoErro)
    { // Tipo de parâmetro alterado para RetornoErro
        this.retornoErro = retornoErro;
    }

    public void setSucesso(String sucesso)
    {
        this.sucesso = sucesso;
    }
}
