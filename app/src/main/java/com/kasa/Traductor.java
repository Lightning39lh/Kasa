package com.kasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class Traductor extends AppCompatActivity {

    Button btTraduccion;
    TextView tvResultado;
    EditText etTraduccion;
    List<String> myArrayListJ;
    List<String> myArrayListR;
    char jor;
    int iEncontrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traductor);
        btTraduccion = (Button) findViewById(R.id.btTraductor);
        tvResultado = (TextView) findViewById(R.id.tvtraductor2);
        etTraduccion = (EditText) findViewById(R.id.etTraducir);
        myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap0));
        myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap0R));

        btTraduccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iEncontrado = -1;
                 for (int i = 0; i < myArrayListJ.size(); i++)
                {
                    //imuestra = i;
                   if (etTraduccion.getText().toString().equals(myArrayListJ.get(i))) {
                        iEncontrado= i;
                        jor= 'j';
                    }
                    if (etTraduccion.getText().toString().toUpperCase().equals(myArrayListR.get(i).toUpperCase())) {
                        iEncontrado= i;
                        jor= 'r';
                    }
                }
                if (iEncontrado == -1){
                    //tvResultado.setText(myArrayListR.size());
                    tvResultado.setText("Lo lamento, esa palabra no se encuentra, prueba de nuevo! :)");
                }
                else{
                    if (jor=='j'){
                        tvResultado.setText(myArrayListR.get(iEncontrado));
                    }
                    else if (jor=='r'){
                        tvResultado.setText(myArrayListJ.get(iEncontrado));
                    }
                }

             }
        }) ;
         }


}
