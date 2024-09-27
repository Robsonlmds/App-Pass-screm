package com.example.pass_screm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundaActivity extends AppCompatActivity {

    private Button btRetornar;
    private TextView tvSituacao;
    private TextView tvIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_activity);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvIdade = findViewById(R.id.tv_idade);
        btRetornar = findViewById(R.id.bt_retornar);
        tvSituacao = findViewById(R.id.tvSituacao);

        Bundle dados = getIntent().getExtras();
        if (dados != null) {
            int idade = dados.getInt("IdadeInserida", 0);
            tvIdade.setText(String.valueOf(idade));

            if (idade < 18) {
                tvSituacao.setText("Você é menor de idade");
            } else {
                tvSituacao.setText("Você é maior de idade");
            }
        }

        btRetornar.setOnClickListener(view -> finish());
    }
}
