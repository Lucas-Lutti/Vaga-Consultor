package com.example.myapplication.api;

import com.example.myapplication.indicacoes.Indicacao;
import com.example.myapplication.indicacoes.RespostaIndicacao;
import com.example.myapplication.oficinas.RespostaOficina;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService
{
    @GET("Api/Oficina")
    Call<RespostaOficina> getOficinas(@Query("codigoAssociacao") int codigoAssociacao, @Query("cpfAssociado") String cpfAssociado);

    @POST("Api/Indicacao")
    Call<RespostaIndicacao> enviarIndicacao(@Body Indicacao indicacao);
}
