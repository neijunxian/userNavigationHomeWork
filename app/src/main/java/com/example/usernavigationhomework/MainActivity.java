package com.example.usernavigationhomework;

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

    public void pageDountCircle(View view) {
        Intent intent = new Intent(MainActivity.this,
                donut_cicle.class);

        startActivity(intent);
    }

    public void pageFroyoCircle(View view) {
        Intent intent = new Intent(MainActivity.this,froyo_circle.class);

        startActivity(intent);
    }

    public void pageIceCreamCircle(View view) {
        Intent intent = new Intent(MainActivity.this,iceCream_circle.class);

        startActivity(intent);
    }
}