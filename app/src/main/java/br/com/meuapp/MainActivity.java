package br.com.meuapp;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referências dos componentes
        Button btnMostrar = findViewById(R.id.btnMostrar);
        Button btnOcultar = findViewById(R.id.btnOcultar);
        txtMensagem = findViewById(R.id.txtMensagem);

        // Botão Mostrar
        btnMostrar.setOnClickListener(view -> {
            txtMensagem.setVisibility(View.VISIBLE);
        });

        // Botão Ocultar
        btnOcultar.setOnClickListener(view -> {
            txtMensagem.setVisibility(View.GONE);
        });
    }
}