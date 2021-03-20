package com.isadora.frasedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Dê mais atenção ao que você tem de bom na sua vida",
                "Para chegar ao topo, o que importa é começar!",
                "De nada adianta ter sonhos, se você não se empenhar em correr atrás",
                "Preste atenção nas oportunidades que estão à sua frente!"
        };

        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textos);
        texto.setText(frases[numero]);

    }
}