package com.kasa.Busqueda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kasa.Games;
import com.kasa.R;

import java.util.Arrays;
import java.util.List;

public class Capitulo1B extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5;
    TextView tvpuntos,tvtiempo,tvromanji,tvpuntosMax;
    List<String> myArrayListJ;
    List<String> myArrayListR;

    Context context = this;
    long mTimeLeftInMillis = 60000; // 1 min

    int[] vectorRandom = new int[5];
    int randomDelRandom,puntos,puntosMax;
    public void onBackPressed()
    {
        Games.mCountDownTimer.cancel();
        Intent intent = new Intent(Capitulo1B.this, Games.class);
        startActivity(intent);

        //super.onBackPressed();  // optional depending on your needs
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StartTimer();
        super.onCreate(savedInstanceState);
        puntos=0;
        setContentView(R.layout.activity_capitulo1_b);
        bt1 = (Button) findViewById(R.id.btcap1g1);
        bt2 = (Button) findViewById(R.id.btcap1g2);
        bt3 = (Button) findViewById(R.id.btcap1g3);
        bt4 = (Button) findViewById(R.id.btcap1g4);
        bt5 = (Button) findViewById(R.id.btcap1g5);
        tvpuntos = (TextView) findViewById(R.id.tvc1puntos);
        tvpuntosMax = (TextView) findViewById(R.id.tvc1puntosMax);
        tvtiempo = (TextView) findViewById(R.id.tvc1tiempo);
        tvtiempo = (TextView) findViewById(R.id.tvc1tiempo);
        tvromanji = (TextView) findViewById(R.id.tvc1Romangi);
        switch (Games.iCapitulo) {
            case 1:
            {
                SharedPreferences sharpref = context.getSharedPreferences("MaxCap1", Context.MODE_PRIVATE);
                myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap1));
                myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap1R));
                puntosMax = sharpref.getInt("maxNumero",0);
                break;
            }
            case 2:
            {
                SharedPreferences sharpref = context.getSharedPreferences("MaxCap2", Context.MODE_PRIVATE);
                myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap2));
                myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap2R));
                puntosMax = sharpref.getInt("maxNumero",0);
                break;
            }
            case 3:
            {
                SharedPreferences sharpref = context.getSharedPreferences("MaxCap3", Context.MODE_PRIVATE);
                myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap3));
                myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap3R));
                puntosMax = sharpref.getInt("maxNumero",0);
                break;
            }
            case 4:
            {
                SharedPreferences sharpref = context.getSharedPreferences("MaxCap4", Context.MODE_PRIVATE);
                myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap4));
                myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap4R));
                puntosMax = sharpref.getInt("maxNumero",0);
                break;
            }
            case 8:
            {
                SharedPreferences sharpref = context.getSharedPreferences("MaxCap8", Context.MODE_PRIVATE);
                myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap8));
                myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap8R));
                puntosMax = sharpref.getInt("maxNumero",0);
                break;
            }
            case 9:
            {
                SharedPreferences sharpref = context.getSharedPreferences("MaxCap9", Context.MODE_PRIVATE);
                myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap9));
                myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap9R));
                puntosMax = sharpref.getInt("maxNumero",0);
                break;
            }
            case 10:
            {
                SharedPreferences sharpref = context.getSharedPreferences("MaxCap10", Context.MODE_PRIVATE);
                myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap10));
                myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap10R));
                puntosMax = sharpref.getInt("maxNumero",0);
                break;
            }
            case 11:
            {
                SharedPreferences sharpref = context.getSharedPreferences("MaxCap11", Context.MODE_PRIVATE);
                myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap11));
                myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap11R));
                puntosMax = sharpref.getInt("maxNumero",0);
                break;
            }
            case 0:
            {
                SharedPreferences sharpref = context.getSharedPreferences("MaxCap0", Context.MODE_PRIVATE);
                myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap0));
                myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap0R));
                puntosMax = sharpref.getInt("maxNumero",0);
                break;
            }


        }


        tvpuntos.setText(String.valueOf(puntos));

        tvpuntosMax.setText(String.valueOf(puntosMax));


        generaAleatorios();


        //genero los numeros aleatorios entre 0 y el tamaño del vector

    }

    public void fijaPuntosMax(){
        if (puntosMax<puntos){
            puntosMax=puntos;
            switch (Games.iCapitulo) {
                case 1:
                {SharedPreferences sharpref = context.getSharedPreferences("MaxCap1", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharpref.edit();
                    editor.putInt("maxNumero", puntos);
                    editor.apply();
                    }
                    break;
                case 2: {
                    SharedPreferences sharpref = context.getSharedPreferences("MaxCap2", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharpref.edit();
                    editor.putInt("maxNumero", puntos);
                    editor.apply();
                }
                    break;
                case 3: {
                    SharedPreferences sharpref = context.getSharedPreferences("MaxCap3", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharpref.edit();
                    editor.putInt("maxNumero", puntos);
                    editor.apply();
                }
                break;
                case 4: {
                    SharedPreferences sharpref = context.getSharedPreferences("MaxCap4", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharpref.edit();
                    editor.putInt("maxNumero", puntos);
                    editor.apply();
                }
                break;
                case 8: {
                    SharedPreferences sharpref = context.getSharedPreferences("MaxCap8", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharpref.edit();
                    editor.putInt("maxNumero", puntos);
                    editor.apply();
                }
                break;
                case 9: {
                    SharedPreferences sharpref = context.getSharedPreferences("MaxCap9", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharpref.edit();
                    editor.putInt("maxNumero", puntos);
                    editor.apply();
                }
                break;
                case 10: {
                    SharedPreferences sharpref = context.getSharedPreferences("MaxCap10", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharpref.edit();
                    editor.putInt("maxNumero", puntos);
                    editor.apply();
                }
                break;
                case 11: {
                    SharedPreferences sharpref = context.getSharedPreferences("MaxCap11", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharpref.edit();
                    editor.putInt("maxNumero", puntos);
                    editor.apply();
                }
                break;
                case 0: {
                    SharedPreferences sharpref = context.getSharedPreferences("MaxCap0", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharpref.edit();
                    editor.putInt("maxNumero", puntos);
                    editor.apply();
                }
                break;

            }


            tvpuntosMax.setText(String.valueOf(puntosMax));

            }



        }


    public void generaAleatorios(){
        Character checkeador;
        int j;
        for (int i =0; i<=(4);i++){
            do {
                vectorRandom[i] = (int) (Math.random()*myArrayListJ.size());
                checkeador = 's';
                if (i != 0) {

                    for (j = 0; j < i; j++) {
                        if (vectorRandom[i] == vectorRandom[j]) {
                            checkeador = 'n';
                        }
                    }
                }
            } while (checkeador != 's');
        }

        bt1.setText(myArrayListJ.get(vectorRandom[0]));
        bt2.setText(myArrayListJ.get(vectorRandom[1]));
        bt3.setText(myArrayListJ.get(vectorRandom[2]));
        bt4.setText(myArrayListJ.get(vectorRandom[3]));
        bt5.setText(myArrayListJ.get(vectorRandom[4]));
        randomDelRandom = (int) (Math.random()*5);
        tvromanji.setText(myArrayListR.get(vectorRandom[randomDelRandom]));

    }
    public void StartTimer(){
        Games.mCountDownTimer = new CountDownTimer(mTimeLeftInMillis,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis= millisUntilFinished;
                String timeLeft = String.format("%2d",mTimeLeftInMillis/1000);
                tvtiempo.setText(timeLeft);
            }

            @Override
            public void onFinish() {
                Intent toVocabulario = new Intent(Capitulo1B.this, Games.class);
                startActivity(toVocabulario);
            }
        }.start();
    }
    public void onClickButton1 (View v){
        if (randomDelRandom == 0) {
            puntos = puntos+1;
            tvpuntos.setText(String.valueOf(puntos));
            fijaPuntosMax();
            generaAleatorios();
        }
        else{
            mTimeLeftInMillis=mTimeLeftInMillis-2000;
            Games.mCountDownTimer.cancel();
            StartTimer();
        }
    }
    public void onClickButton2 (View v){
        if (randomDelRandom == 1) {
            puntos = puntos+1;
            tvpuntos.setText(String.valueOf(puntos));
            fijaPuntosMax();
            generaAleatorios();

        }
        else{
            mTimeLeftInMillis=mTimeLeftInMillis-2000;
            Games.mCountDownTimer.cancel();
            StartTimer();
        }
    }
    public void onClickButton3 (View v){
        if (randomDelRandom == 2) {
            puntos = puntos+1;
            tvpuntos.setText(String.valueOf(puntos));
            fijaPuntosMax();
            generaAleatorios();
        }
        else{
            mTimeLeftInMillis=mTimeLeftInMillis-2000;
            Games.mCountDownTimer.cancel();
            StartTimer();
        }
    }
    public void onClickButton4 (View v){
        if (randomDelRandom == 3) {
            puntos = puntos+1;
            tvpuntos.setText(String.valueOf(puntos));
            fijaPuntosMax();
            generaAleatorios();
        }
        else{
            mTimeLeftInMillis=mTimeLeftInMillis-2000;
            Games.mCountDownTimer.cancel();
            StartTimer();
        }
    }
    public void onClickButton5 (View v){
        if (randomDelRandom == 4) {
            puntos = puntos+1;
            tvpuntos.setText(String.valueOf(puntos));
            fijaPuntosMax();
            generaAleatorios();
        }
        else{
            mTimeLeftInMillis=mTimeLeftInMillis-2000;
            Games.mCountDownTimer.cancel();
            StartTimer();
        }
    }


}
