package com.example.usernavigationhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class donut_cicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_cicle);

        getSupportActionBar().setTitle("Dount Cicle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}