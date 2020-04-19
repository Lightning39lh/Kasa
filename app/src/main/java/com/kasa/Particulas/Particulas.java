package com.kasa.Particulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kasa.Learn;
import com.kasa.R;
import com.kasa.Vocabulario.ParticulasIn;

public class Particulas extends AppCompatActivity {

    public static int particula;
    Button btMo,btNo;
    //,btCap8,btCap2,btCap9,btCap10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulario);
        btMo =(Button)findViewById(R.id.btMo);
        btNo =(Button)findViewById(R.id.btNo);
        /*btCap3 =(Button)findViewById(R.id.btCap3);
        btCap4 =(Button)findViewById(R.id.btCap4);
        btCap8 =(Button)findViewById(R.id.btCap8);
        btCap9 =(Button)findViewById(R.id.btCap9);
        btCap10 =(Button)findViewById(R.id.btCap10);*/
        btMo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                particula = 1;
                Intent toParticula = new Intent(Particulas.this, ParticulasIn.class);
                startActivity(toParticula);
            }
        });
        btNo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                particula = 2;
                Intent toParticula = new Intent(Particulas.this, ParticulasIn.class);
                startActivity(toParticula);
            }
        });
       /* btCap3.setOnClickListener(new View.OnClickListener()
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
        });*/
    }
}
