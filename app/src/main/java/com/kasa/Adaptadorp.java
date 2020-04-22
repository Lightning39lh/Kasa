package com.kasa;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kasa.Entidad;
import com.kasa.R;

import java.util.ArrayList;

public class Adaptadorp extends BaseAdapter {
    private Context context;
    private ArrayList<Entidadp> listItems;


    public Adaptadorp(Context context, ArrayList<Entidadp> listItems) {
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
        Entidadp Itemp = (Entidadp) getItem(position);

        //el convertview ya hace por defecto de forma ciclica con el getcount
        convertView = LayoutInflater.from(context).inflate(R.layout.itemp, null);
        TextView tvExplicacion = convertView.findViewById(R.id.tvip1);
        TextView tvJapones = convertView.findViewById(R.id.tvip2);
        TextView tvRomanji = convertView.findViewById(R.id.tvip3);

        tvExplicacion.setText(Html.fromHtml(Itemp.getExplicacion()));
        tvJapones.setText(Itemp.getJapones());
        tvRomanji.setText(Itemp.getRomanji());
        return convertView;
    }
}

