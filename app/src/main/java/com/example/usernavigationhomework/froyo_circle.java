package com.example.usernavigationhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class froyo_circle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_froyo_circle);

        getSupportActionBar().setTitle("Froyo Cicle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}