package com.kasa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context context;
    private ArrayList<Entidad> listItems;

    public Adaptador(Context context, ArrayList<Entidad> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Entidad Item = (Entidad) getItem(position);

        //el convertview ya hace por defecto de forma ciclica con el getcount
        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        TextView tvJapones = convertView.findViewById(R.id.tvi1);
        TextView tvRomanji = convertView.findViewById(R.id.tvi2);
        tvJapones.setText(Item.getJapones());
        tvRomanji.setText(Item.getRomanji());
        return convertView;
    }
}

