package com.example.usernavigationhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class iceCream_circle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_cream_circle);

        getSupportActionBar().setTitle("Ice Cream Cicle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}