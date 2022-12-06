package com.example.newcustomspinner;

import androidx.annotation.DoNotInline;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spin;
    TextView tv1,tv2,tv3;
    String [] country = {"Choose country","France","India","Morocco","Peru","Portugal","Serbia","Spain"};
    int [] imgid = {0,R.drawable.france,R.drawable.india,R.drawable.morocco,R.drawable.peru,R.drawable.portugal,R.drawable.serbia,R.drawable.spain};
    String[] population = {"","67.5M","1.393B","37.34M","33.36M","10.3M","6.84M","47.33M"};
    String[] capital = {"","Paris","New Delhi","Rabat","Lima","Lisbon","Belgrade","Madrid"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin = (Spinner) findViewById(R.id.spinner);
        tv1 = (TextView) findViewById(R.id.textView2);
        tv2 = (TextView) findViewById(R.id.textView4);
        tv3 = (TextView) findViewById(R.id.textView7);
        spin.setOnItemSelectedListener(this);
        CustomAdapter customadp = new CustomAdapter(getApplicationContext(), capital, imgid,country);
        spin.setAdapter(customadp);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i>0){
            tv1.setText(country[i]);
        }
        else{
            tv1.setText("");
        }
        tv2.setText(capital[i]);
        tv3.setText(population[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}