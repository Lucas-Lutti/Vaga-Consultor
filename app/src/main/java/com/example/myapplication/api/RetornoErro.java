package com.example.myapplication.api;

import com.google.gson.annotations.SerializedName;

public class RetornoErro
{
    @SerializedName("RetornoErro")
    private String retornoErro;
    @SerializedName("mensagemErro")
    private String mensagemErro;

    public String getRetornoErro()
    {
        return retornoErro;
    }

    public void setRetornoErro(String retornoErro)
    {
        this.retornoErro = retornoErro;
    }

    // Getter
    public String getMensagemErro() {
        return mensagemErro;
    }

    // Setter
    public void setMensagemErro(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }
}
