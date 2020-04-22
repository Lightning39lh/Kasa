package com.kasa.Vocabulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kasa.Learn;
import com.kasa.R;

public class Vocabulario extends AppCompatActivity {

    public static int capitulo;
    Button btCap1,btCap3,btCap4,btCap8,btCap2,btCap9,btCap10,btCap11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulario);
        btCap1 =(Button)findViewById(R.id.btCap1);
        btCap2 =(Button)findViewById(R.id.btCap2);
        btCap3 =(Button)findViewById(R.id.btCap3);
        btCap4 =(Button)findViewById(R.id.btCap4);
        btCap8 =(Button)findViewById(R.id.btCap8);
        btCap9 =(Button)findViewById(R.id.btCap9);
        btCap10 =(Button)findViewById(R.id.btCap10);
        btCap11 =(Button)findViewById(R.id.btCap11);
        btCap1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                capitulo = 1;
                Intent toVocabulario = new Intent(Vocabulario.this, Capitulo1.class);
                startActivity(toVocabulario);
            }
        });
        btCap2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                capitulo = 2;
                Intent toVocabulario = new Intent(Vocabulario.this, Capitulo1.class);
                startActivity(toVocabulario);
            }
        });
        btCap3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                capitulo = 3;
                Intent toVocabulario = new Intent(Vocabulario.this, Capitulo1.class);
                startActivity(toVocabulario);
            }
        });
        btCap4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                capitulo = 4;
                Intent toVocabulario = new Intent(Vocabulario.this, Capitulo1.class);
                startActivity(toVocabulario);
            }
        });
        btCap8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                capitulo = 8;
                Intent toVocabulario = new Intent(Vocabulario.this, Capitulo1.class);
                startActivity(toVocabulario);
            }
        });
        btCap9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                capitulo = 9;
                Intent toVocabulario = new Intent(Vocabulario.this, Capitulo1.class);
                startActivity(toVocabulario);
            }
        });
        btCap10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                capitulo = 10;
                Intent toVocabulario = new Intent(Vocabulario.this, Capitulo1.class);
                startActivity(toVocabulario);
            }
        });
        btCap11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                capitulo = 11;
                Intent toVocabulario = new Intent(Vocabulario.this, Capitulo1.class);
                startActivity(toVocabulario);
            }
        });
    }
}
