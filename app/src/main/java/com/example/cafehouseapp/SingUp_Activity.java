package com.example.cafehouseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SingUp_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        getSupportActionBar().setTitle("Sign Up");      // it set tool bar as signin in sign in page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}