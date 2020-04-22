package com.kasa.Particulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.kasa.R;


public class Particulas extends AppCompatActivity {

    public static int particula;
    Button btMo,btNo,btNi,btHe,btDe,btTo,btWo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particulas);
        btMo =(Button)findViewById(R.id.btMo);
        btNo =(Button)findViewById(R.id.btNo);
        btNi =(Button)findViewById(R.id.btNi);
        btTo =(Button)findViewById(R.id.btTo);
        btHe =(Button)findViewById(R.id.btHe);
        btDe =(Button)findViewById(R.id.btDe);
        btWo =(Button)findViewById(R.id.btWo);



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
        btNi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                particula = 3;
                Intent toParticula = new Intent(Particulas.this, ParticulasIn.class);
                startActivity(toParticula);
            }
        });
        btTo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                particula = 4;
                Intent toParticula = new Intent(Particulas.this, ParticulasIn.class);
                startActivity(toParticula);
            }
        });
        btHe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                particula = 5;
                Intent toParticula = new Intent(Particulas.this, ParticulasIn.class);
                startActivity(toParticula);
            }
        });
        btDe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                particula = 6;
                Intent toParticula = new Intent(Particulas.this, ParticulasIn.class);
                startActivity(toParticula);
            }
        });
        btWo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                particula = 7;
                Intent toParticula = new Intent(Particulas.this, ParticulasIn.class);
                startActivity(toParticula);
            }
        });



    }
}
