package com.example.vedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HomePage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page1);

        getSupportActionBar().hide();
    }
}