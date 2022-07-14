package com.example.cafehouseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class sign_in_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().setTitle("Sign In");      // it set tool bar as signin in sign in page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}