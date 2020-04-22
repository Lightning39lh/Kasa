package com.kasa;

import android.content.Intent;
import android.os.Bundle;

import com.kasa.Particulas.Particulas;
import com.kasa.Vocabulario.Vocabulario;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class Learn extends AppCompatActivity
{
    Button btVocabulario;
    Button btParticulas;
    Button btTraductor;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        btVocabulario=(Button)findViewById(R.id.btVocabulario);
        btParticulas=(Button)findViewById(R.id.btParticulas);
        btTraductor=(Button)findViewById(R.id.btTraductor);
        btVocabulario.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent toVocabulario = new Intent(Learn.this, Vocabulario.class);
                startActivity(toVocabulario);
            }
        });
        btParticulas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent toParticulas = new Intent (Learn.this, Particulas.class);
                startActivity(toParticulas);
            }
        });
        btTraductor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent toParticulas = new Intent (Learn.this, Traductor.class);
                startActivity(toParticulas);
            }
        });
    }

}


