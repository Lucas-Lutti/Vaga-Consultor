package com.example.myapplication.oficinas;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
import com.example.myapplication.api.ApiService;
import com.example.myapplication.api.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import java.util.ArrayList;


public class FragmentoOficinas extends Fragment
{
    private RecyclerView recyclerView;
    private AdapterListaOficinas listaOficinasAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_oficinas, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewOficinas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        listaOficinasAdapter = new AdapterListaOficinas(new ArrayList<>(), getContext());
        recyclerView.setAdapter(listaOficinasAdapter);

        buscarOficinas();

        return view;
    }

    void buscarOficinas()
    {
        ApiService apiService = RetrofitClient.getApiService();
        apiService.getOficinas(601, "").enqueue(new Callback<RespostaOficina>()
        {
            @Override
            public void onResponse(Call<RespostaOficina> call, Response<RespostaOficina> response)
            {
                if (response.isSuccessful() && response.body() != null)
                {
                    listaOficinasAdapter = new AdapterListaOficinas(response.body().getListaOficinas(), getContext());
                    recyclerView.setAdapter(listaOficinasAdapter);
                } else
                {
                    Toast.makeText(getContext(), "Erro ao buscar oficinas", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<RespostaOficina> call, Throwable t)
            {
                Log.e("API Error", "Falha na comunicação", t);
                Toast.makeText(getContext(), "Falha na comunicação: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }



}
