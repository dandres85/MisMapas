package com.dariollano.mismapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irMapa1(View v){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }

    public void irMapa2(View v){
        Intent i2 = new Intent(this, MapsActivity2.class);
        startActivity(i2);
    }
    public void irMapa3(View v){
        Intent i3 = new Intent(this, MapsActivity3.class);
        startActivity(i3);
    }
    public void irMapa4(View v){
        Intent i4 = new Intent(this, MapsActivity4.class);
        startActivity(i4);
    }
}