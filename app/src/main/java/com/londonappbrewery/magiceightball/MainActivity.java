package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.image_oitoBall);
        final TextView textDisplay = findViewById(R.id.texto);
        final int[] ballArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        String texto = "texto1";

        final String [] textArray = new String[]{
                "I'm a text that changes too",
                "I'm another text",
                "And another one",
                "I'm a text",
                "Here goes a text"
        };

        Button perguntarButton = findViewById(R.id.perguntarButton);
        perguntarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random numeroAleatorio = new Random();
                int numero = numeroAleatorio.nextInt(5);

                int imageResourceId = ballArray[numero];
                ballDisplay.setImageResource(imageResourceId);

                String textoResourceId = textArray[numero];
                textDisplay.setText(textoResourceId);

            }
        });
    }
}
