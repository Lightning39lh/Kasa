package com.kasa.Vocabulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import com.kasa.Adaptador;
import com.kasa.Entidad;
import com.kasa.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Boolean.FALSE;

public class Capitulo1 extends AppCompatActivity {

    ListView lvCap1;
    CheckBox cbc1;
    Adaptador adaptadorj;
    Adaptador adaptadorr;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_capitulo1);
        cbc1 = (CheckBox) findViewById(R.id.cbc1);
        lvCap1 = (ListView) findViewById(R.id.lv01);
        titulo = (TextView) findViewById(R.id.titulo);
        switch (Vocabulario.capitulo){
            case 1: {
            titulo.setText("Capitulo 1");
            break;
            }
            case 2: {
                titulo.setText("Capitulo 2");
                break;
            }
            case 3: {
                titulo.setText("Capitulo 3");
                break;
            }
            case 4: {
                titulo.setText("Capitulo 4");
                break;
            }
            case 8: {
                titulo.setText("Capitulo 8");
                break;
            }
            case 9: {
                titulo.setText("Capitulo 9");
                break;
            }case 10: {
                titulo.setText("Capitulo 10");
                break;
            }



        }

       // adaptadorj = ArrayAdapter.createFromResource(this, R.array.Cap1, android.R.layout.simple_list_item_1);

        adaptadorr = new Adaptador(this, GetArrayItemsr());
        adaptadorj = new Adaptador(this, GetArrayItemsj());
        lvCap1.setAdapter(adaptadorj);
    }

    public void onCheckBowClicked (View v)
    {
        if (cbc1.isChecked())
        {
            lvCap1.setAdapter(adaptadorr);
        }
        else
           lvCap1.setAdapter((adaptadorj));
    }
    private ArrayList<Entidad> GetArrayItemsr(){
        ArrayList<Entidad> listItems = new ArrayList<>();
        //hago un array con las cosas para usar las funciones de lista.
        switch (Vocabulario.capitulo) {
            case 1: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap1));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap1R));
                for (int i = 0;i < myArrayListJ.size();i++)
                {
                    listItems.add(new Entidad(myArrayListJ.get(i),myArrayListR.get(i)));
                }
                break;
            }
            case 2: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap2));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap2R));
                for (int i = 0;i < myArrayListJ.size();i++)
                {
                    listItems.add(new Entidad(myArrayListJ.get(i),myArrayListR.get(i)));
                }
                break;
            }
            case 3: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap3));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap3R));
                for (int i = 0;i < myArrayListJ.size();i++)
                {
                    listItems.add(new Entidad(myArrayListJ.get(i),myArrayListR.get(i)));
                }
                break;
            }
            case 4: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap4));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap4R));
                for (int i = 0;i < myArrayListJ.size();i++)
                {
                    listItems.add(new Entidad(myArrayListJ.get(i),myArrayListR.get(i)));
                }
                break;
            }
            case 8: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap8));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap8R));
                for (int i = 0;i < myArrayListJ.size();i++)
                {
                    listItems.add(new Entidad(myArrayListJ.get(i),myArrayListR.get(i)));
                }
                break;
            }
            case 9: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap9));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap9R));
                for (int i = 0;i < myArrayListJ.size();i++)
                {
                    listItems.add(new Entidad(myArrayListJ.get(i),myArrayListR.get(i)));
                }
                break;
            }
            case 10: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap10));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.Cap10R));
                for (int i = 0;i < myArrayListJ.size();i++)
                {
                    listItems.add(new Entidad(myArrayListJ.get(i),myArrayListR.get(i)));
                }
                break;
            }
        }

        return listItems;

    }
    private ArrayList<Entidad> GetArrayItemsj(){
        ArrayList<Entidad> listItems = new ArrayList<>();
        //hago un array con las cosas para usar las funciones de lista.
        switch (Vocabulario.capitulo) {
            case 1: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap1));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.vacio));
                for (int i = 0; i < myArrayListJ.size(); i++) {
                    listItems.add(new Entidad(myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 2: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap2));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.vacio));
                for (int i = 0; i < myArrayListJ.size(); i++) {
                    listItems.add(new Entidad(myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 3: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap3));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.vacio));
                for (int i = 0; i < myArrayListJ.size(); i++) {
                    listItems.add(new Entidad(myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 4: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap4));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.vacio));
                for (int i = 0; i < myArrayListJ.size(); i++) {
                    listItems.add(new Entidad(myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 8: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap8));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.vacio));
                for (int i = 0; i < myArrayListJ.size(); i++) {
                    listItems.add(new Entidad(myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 9: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap9));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.vacio));
                for (int i = 0; i < myArrayListJ.size(); i++) {
                    listItems.add(new Entidad(myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 10: {
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.Cap10));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.vacio));
                for (int i = 0; i < myArrayListJ.size(); i++) {
                    listItems.add(new Entidad(myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }



        }
        return listItems;

    }




}
