package com.example.myapplication.oficinas;

import com.example.myapplication.api.RetornoErro;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RespostaOficina
{
    @SerializedName("ListaOficinas")
    private List<Oficina> ListaOficinas;
    @SerializedName("RetornoErro")
    private com.example.myapplication.api.RetornoErro RetornoErro;
    @SerializedName("Token")
    private String Token;

    public List<Oficina> getListaOficinas()
    {
        return ListaOficinas;
    }

    public RetornoErro getRetornoErro()
    {
        return RetornoErro;
    }

    public String getToken()
    {
        return Token;
    }

    public void setListaOficinas(List<Oficina> listaOficinas)
    {
        this.ListaOficinas = listaOficinas;
    }

    public void setRetornoErro(RetornoErro retornoErro)
    {
        this.RetornoErro = retornoErro;
    }

    public void setToken(String token)
    {
        this.Token = token;
    }
}
