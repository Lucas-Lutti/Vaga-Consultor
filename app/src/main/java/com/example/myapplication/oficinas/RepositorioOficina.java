package com.example.myapplication.oficinas;

import com.example.myapplication.api.ApiService;
import com.example.myapplication.api.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;

public class RepositorioOficina
{
    private ApiService apiService;

    public RepositorioOficina()
    {

        this.apiService = RetrofitClient.getApiService();
    }

    public void getOficinas(int codigoAssociacao, String cpfAssociado, Callback<RespostaOficina> callback)
    {
        Call<RespostaOficina> call = apiService.getOficinas(codigoAssociacao, cpfAssociado);
        call.enqueue(callback);
    }
}
