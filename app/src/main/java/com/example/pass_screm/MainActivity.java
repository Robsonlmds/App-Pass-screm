package com.example.pass_screm;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btEnviar;
    private TextView etIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View mainView = findViewById(R.id.main);
        if (mainView == null) {
            Log.e("MainActivity", "Erro: layout 'main' não encontrado no arquivo XML.");
            return;
        }

        ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etIdade = findViewById(R.id.et_idade);
        btEnviar = findViewById(R.id.bt_enviar);

        if (etIdade == null) {
            Log.e("MainActivity", "Erro: Campo 'etIdade' não encontrado no layout.");
            return;
        }
        if (btEnviar == null) {
            Log.e("MainActivity", "Erro: Botão 'btEnviar' não encontrado no layout.");
            return;
        }

        btEnviar.setOnClickListener(view -> {
            int idade;

            try {
                idade = Integer.parseInt(etIdade.getText().toString());
            } catch (NumberFormatException e) {
                idade = 0;
                Log.e("MainActivity", "Erro: Idade inválida inserida.");
            }

            Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
            intent.putExtra("IdadeInserida", idade);

            try {
                startActivity(intent);
            } catch (Exception e) {
                Log.e("MainActivity", "Erro ao iniciar SegundaActivity: " + e.getMessage());
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (etIdade != null) {
            etIdade.setText("");
        }
    }
}
