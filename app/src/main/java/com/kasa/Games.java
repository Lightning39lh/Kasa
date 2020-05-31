package com.kasa;

import android.content.Intent;
import android.os.Bundle;

import com.kasa.Busqueda.Capitulo1B;

import androidx.appcompat.app.AppCompatActivity;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class Games extends AppCompatActivity
{
    public static CountDownTimer mCountDownTimer ;
    public static int iCapitulo;
    Button btCap0,btCap1,btCap2,btCap3,btCap4,btCap8,btCap9,btCap10,btCap11,btCap12;


    public void onBackPressed()
    {

        Intent intent = new Intent(Games.this, MainActivity.class);
        startActivity(intent);

        //super.onBackPressed();  // optional depending on your needs
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        btCap0=(Button)findViewById(R.id.btGame0);
        btCap1=(Button)findViewById(R.id.btGame1);
        btCap2=(Button)findViewById(R.id.btGame2);
        btCap3=(Button)findViewById(R.id.btGame3);
        btCap4=(Button)findViewById(R.id.btGame4);
        btCap8=(Button)findViewById(R.id.btGame8);
        btCap9=(Button)findViewById(R.id.btGame9);
        btCap10=(Button)findViewById(R.id.btGame10);
        btCap11=(Button)findViewById(R.id.btGame11);
        btCap12=(Button)findViewById(R.id.btGame12);


        btCap1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                iCapitulo = 1;
                Intent toVocabulario = new Intent(Games.this, Capitulo1B.class);
                startActivity(toVocabulario);
            }
        });
        btCap2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                iCapitulo = 2;
                Intent toVocabulario = new Intent(Games.this, Capitulo1B.class);
                startActivity(toVocabulario);
            }
        });
        btCap3.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    iCapitulo = 3;
                Intent toVocabulario = new Intent(Games.this, Capitulo1B.class);
                startActivity(toVocabulario);
            }
        });

        btCap4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                iCapitulo = 4;
                Intent toVocabulario = new Intent(Games.this, Capitulo1B.class);
                startActivity(toVocabulario);
            }
        });
        btCap8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                iCapitulo = 8;
                Intent toVocabulario = new Intent(Games.this, Capitulo1B.class);
                startActivity(toVocabulario);
            }
        });

        btCap9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                iCapitulo = 9;
                Intent toVocabulario = new Intent(Games.this, Capitulo1B.class);
                startActivity(toVocabulario);
            }
        });
        btCap10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCapitulo = 10;
                Intent toVocabulario = new Intent(Games.this, Capitulo1B.class);
                startActivity(toVocabulario);
            }
        });

        btCap11.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    iCapitulo = 11;
                    Intent toVocabulario = new Intent(Games.this, Capitulo1B.class);
                    startActivity(toVocabulario);

        }
        });
        btCap12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                iCapitulo = 12;
                Intent toVocabulario = new Intent(Games.this, Capitulo1B.class);
                startActivity(toVocabulario);
            }
        });
        btCap0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                iCapitulo = 0;
                Intent toVocabulario = new Intent(Games.this, Capitulo1B.class);
                startActivity(toVocabulario);
            }
        });

    }
}



