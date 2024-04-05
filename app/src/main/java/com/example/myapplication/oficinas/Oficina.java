package com.example.myapplication.oficinas;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Oficina implements Serializable
{
    private int Id;
    private String Nome;
    private String Descricao;
    private String DescricaoCurta;
    private String Endereco;
    private String Latitude;
    private String Longitude;
    private String Foto;
    private int AvaliacaoUsuario;
    private int CodigoAssociacao;
    private String Email;
    private String Telefone1;
    private String Telefone2;
    private boolean Ativo;

    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        this.Id = id;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        this.Nome = nome;
    }

    public String getDescricao()
    {
        return Descricao;
    }

    public void setDescricao(String descricao)
    {
        this.Descricao = descricao;
    }

    public String getDescricaoCurta()
    {
        return DescricaoCurta;
    }

    public void setDescricaoCurta(String descricaoCurta)
    {
        this.DescricaoCurta = descricaoCurta;
    }

    public String getEndereco()
    {
        return Endereco;
    }

    public void setEndereco(String endereco)
    {
        this.Endereco = endereco;
    }

    public String getLatitude()
    {
        return Latitude;
    }

    public void setLatitude(String latitude)
    {
        this.Latitude = latitude;
    }

    public String getLongitude()
    {
        return Longitude;
    }

    public void setLongitude(String longitude)
    {
        this.Longitude = longitude;
    }

    public String getFoto()
    {
        return Foto;
    }

    public void setFoto(String foto)
    {
        this.Foto = foto;
    }

    public int getAvaliacaoUsuario()
    {
        return AvaliacaoUsuario;
    }

    public void setAvaliacaoUsuario(int avaliacaoUsuario)
    {
        this.AvaliacaoUsuario = avaliacaoUsuario;
    }

    public int getCodigoAssociacao()
    {
        return CodigoAssociacao;
    }

    public void setCodigoAssociacao(int codigoAssociacao)
    {
        this.CodigoAssociacao = codigoAssociacao;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String email)
    {
        this.Email = email;
    }

    public String getTelefone1() {
        return Telefone1;
    }

    public void setTelefone1(String telefone1)
    {
        this.Telefone1 = telefone1;
    }

    public String getTelefone2()
    {
        return Telefone2;
    }

    public void setTelefone2(String telefone2)
    {
        this.Telefone2 = telefone2;
    }

    public boolean isAtivo()
    {
        return Ativo;
    }

    public void setAtivo(boolean ativo)
    {
        this.Ativo = ativo;
    }
}
