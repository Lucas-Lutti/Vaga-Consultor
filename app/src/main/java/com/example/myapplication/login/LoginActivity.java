package com.example.myapplication.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.principal.MainActivity;

public class LoginActivity extends AppCompatActivity
{
    private EditText editTextCpf, editTextPassword;
    private Button buttonLogin, buttonGoToRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextCpf = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonGoToRegister = findViewById(R.id.buttonGoToRegister);

        buttonLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String cpf = editTextCpf.getText().toString();
                String password = editTextPassword.getText().toString();
                //78885983073 login
                //37038958887 senha
                if("78885983073".equals(cpf) && "37038958887".equals(password))
                {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else
                {
                    Toast.makeText(LoginActivity.this, "CPF ou senha inválidos", Toast.LENGTH_LONG).show();
                }
            }
        });


        buttonGoToRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
