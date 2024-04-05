package com.example.myapplication.principal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.indicacoes.FragmentoIndicacoes;
import com.example.myapplication.oficinas.DetalhesOficinaActivity;
import com.example.myapplication.oficinas.Oficina;
import com.example.myapplication.oficinas.FragmentoOficinas;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Configura o adapter das seções com os fragments de oficinas e indicações
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager(), new FragmentoOficinas(), new FragmentoIndicacoes());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
    }

    public void abrirDetalhesOficina(Oficina oficina)
    {
        Intent intent = new Intent(this, DetalhesOficinaActivity.class);
        intent.putExtra("oficina", oficina);
        startActivity(intent);
    }

}
