package com.kasa.Particulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.kasa.Adaptadorp;
import com.kasa.Entidad;
import com.kasa.Entidadp;
import com.kasa.Learn;
import com.kasa.Particulas.Particulas;
import com.kasa.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParticulasIn extends AppCompatActivity {

    Adaptadorp adaptador;
    ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particulas_in);
        lv1 = (ListView) findViewById(R.id.lvp01);
        adaptador = new Adaptadorp(this, GetArrayItems());
        lv1.setAdapter(adaptador);
    }

    private ArrayList<Entidadp> GetArrayItems() {
        ArrayList<Entidadp> listItems = new ArrayList<>();
        //hago un array con las cosas para usar las funciones de lista.
        switch (Particulas.particula) {
            case 1: {
                List<String> myArrayList = Arrays.asList(getResources().getStringArray(R.array.mo));
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.moj));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.mor));
                for (int i = 0; i < myArrayListJ.size(); i++) {
                    listItems.add(new Entidadp(myArrayList.get(i), myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 2: {
                List<String> myArrayList = Arrays.asList(getResources().getStringArray(R.array.no));
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.noj));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.nor));
                for (int i = 0; i < myArrayList.size(); i++) {
                    listItems.add(new Entidadp(myArrayList.get(i), myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 3: {
                List<String> myArrayList = Arrays.asList(getResources().getStringArray(R.array.ni));
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.nij));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.nir));
                for (int i = 0; i < myArrayList.size(); i++) {
                    listItems.add(new Entidadp(myArrayList.get(i), myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 4: {
                List<String> myArrayList = Arrays.asList(getResources().getStringArray(R.array.to));
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.toj));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.tor));
                for (int i = 0; i < myArrayList.size(); i++) {
                    listItems.add(new Entidadp(myArrayList.get(i), myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 5: {
                List<String> myArrayList = Arrays.asList(getResources().getStringArray(R.array.he));
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.hej));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.her));
                for (int i = 0; i < myArrayList.size(); i++) {
                    listItems.add(new Entidadp(myArrayList.get(i), myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 6: {
                List<String> myArrayList = Arrays.asList(getResources().getStringArray(R.array.de));
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.dej));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.der));
                for (int i = 0; i < myArrayList.size(); i++) {
                    listItems.add(new Entidadp(myArrayList.get(i), myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }
            case 7: {
                List<String> myArrayList = Arrays.asList(getResources().getStringArray(R.array.wo));
                List<String> myArrayListJ = Arrays.asList(getResources().getStringArray(R.array.woj));
                List<String> myArrayListR = Arrays.asList(getResources().getStringArray(R.array.wor));
                for (int i = 0; i < myArrayList.size(); i++) {
                    listItems.add(new Entidadp(myArrayList.get(i), myArrayListJ.get(i), myArrayListR.get(i)));
                }
                break;
            }

        }
        return listItems;
    }
}
