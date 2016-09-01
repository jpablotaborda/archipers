package com.example.jpablotaborda.ejercicioslayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void otradistri(View v){
        Intent lanzar_ven= new Intent(this, distrib.class);
        startActivity(lanzar_ven);
        this.finish();
    }
}
