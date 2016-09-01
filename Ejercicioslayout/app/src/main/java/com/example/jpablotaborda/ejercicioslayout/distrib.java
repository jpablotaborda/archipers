package com.example.jpablotaborda.ejercicioslayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class distrib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distrib);
    }
    public void asorpresa(View v){
        Intent lan_sorpresa= new Intent(this, sorpresa.class);
        startActivity(lan_sorpresa);
        this.finish();

    }
}
