package com.example.cafehouseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button login,signup;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.btnlogin);
        signup=findViewById(R.id.btnsignup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,sign_in_Activity.class);
                startActivity(intent);
            }

        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SingUp_Activity.class);
                startActivity(intent);
            }
        });
    }
}