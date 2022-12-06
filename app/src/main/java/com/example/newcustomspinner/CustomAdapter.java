package com.example.newcustomspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String cityList[];
    int symbols[];
    String country[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] cityList, int[] symbols,String[] country) {
        this.context = applicationContext;
        this.cityList = cityList;
        this.symbols = symbols;
        this.country = country;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return cityList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner, null);
        TextView city = (TextView) view.findViewById(R.id.textView8);
        TextView country1 = (TextView) view.findViewById(R.id.textView3);
        ImageView symbol = (ImageView) view.findViewById(R.id.imageView);
        city.setText(cityList[i]);
        symbol.setImageResource(symbols[i]);
        country1.setText(country[i]);
        return view;
    }
}

