package com.example.myapplication.indicacoes;

import com.example.myapplication.api.ApiService;
import com.example.myapplication.api.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;

public class RepositorioIndicacao
{
    private ApiService apiService;

    public RepositorioIndicacao()
    {
        this.apiService = RetrofitClient.getApiService();
    }

    public void enviarIndicacao(Indicacao indicacao, Callback<RespostaIndicacao> callback)
    {
        Call<RespostaIndicacao> call = apiService.enviarIndicacao(indicacao);
        call.enqueue(callback);
    }
}
