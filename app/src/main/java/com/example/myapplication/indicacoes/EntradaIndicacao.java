package com.example.myapplication.indicacoes;

import java.io.Serializable;

public class EntradaIndicacao implements Serializable
{
    private Indicacao Indicacao;
    private String Remetente;
    private String[] Copias;

    public Indicacao getIndicacao()
    {
        return Indicacao;
    }

    public String getRemetente()
    {
        return Remetente;
    }

    public String[] getCopias()
    {
        return Copias;
    }

    public void setIndicacao(Indicacao indicacao)
    {
        this.Indicacao = indicacao;
    }

    public void setRemetente(String remetente)
    {
        this.Remetente = remetente;
    }

    public void setCopias(String[] copias)
    {
        this.Copias = copias;
    }
}
