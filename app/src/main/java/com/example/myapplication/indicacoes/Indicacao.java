package com.example.myapplication.indicacoes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class Indicacao implements Serializable
{
    @SerializedName("CodigoAssociacao")
    private String codigoAssociacao;
    @SerializedName("DataCriacao")
    private String dataCriacao;
    @SerializedName("CpfAssociado")
    private String cpfAssociado;
    @SerializedName("EmailAssociado")
    private String emailAssociado;
    @SerializedName("NomeAssociado")
    private String nomeAssociado;
    @SerializedName("TelefoneAssociado")
    private String telefoneAssociado;
    @SerializedName("PlacaVeiculoAssociado")
    private String placaVeiculoAssociado;
    @SerializedName("NomeAmigo")
    private String nomeAmigo;
    @SerializedName("TelefoneAmigo")
    private String telefoneAmigo;
    @SerializedName("EmailAmigo")
    private String emailAmigo;

    public String getCodigoAssociacao()
    {
        return codigoAssociacao;
    }

    public void setCodigoAssociacao(String codigoAssociacao)
    {
        this.codigoAssociacao = codigoAssociacao;
    }

    public String getDataCriacao()
    {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao)
    {
        this.dataCriacao = dataCriacao;
    }

    public String getCpfAssociado()
    {
        return cpfAssociado;
    }

    public void setCpfAssociado(String cpfAssociado)
    {
        this.cpfAssociado = cpfAssociado;
    }

    public String getEmailAssociado()
    {
        return emailAssociado;
    }

    public void setEmailAssociado(String emailAssociado)
    {
        this.emailAssociado = emailAssociado;
    }

    public String getNomeAssociado()
    {
        return nomeAssociado;
    }

    public void setNomeAssociado(String nomeAssociado)
    {
        this.nomeAssociado = nomeAssociado;
    }

    public String getTelefoneAssociado()
    {
        return telefoneAssociado;
    }

    public void setTelefoneAssociado(String telefoneAssociado)
    {
        this.telefoneAssociado = telefoneAssociado;
    }

    public String getPlacaVeiculoAssociado()
    {
        return placaVeiculoAssociado;
    }

    public void setPlacaVeiculoAssociado(String placaVeiculoAssociado)
    {
        this.placaVeiculoAssociado = placaVeiculoAssociado;
    }

    public String getNomeAmigo()
    {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo)
    {
        this.nomeAmigo = nomeAmigo;
    }

    public String getTelefoneAmigo()
    {
        return telefoneAmigo;
    }

    public void setTelefoneAmigo(String telefoneAmigo)
    {
        this.telefoneAmigo = telefoneAmigo;
    }

    public String getEmailAmigo()
    {
        return emailAmigo;
    }

    public void setEmailAmigo(String emailAmigo)
    {
        this.emailAmigo = emailAmigo;
    }
}
