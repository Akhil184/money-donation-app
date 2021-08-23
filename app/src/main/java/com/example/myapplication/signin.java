package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        TextView jj = findViewById(R.id.cc);
        jj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signin.this, reset1.class);
                startActivity(intent);
            }
        });
        TextView jjk = findViewById(R.id.cnn);
        jjk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signin.this, signup1.class);
                startActivity(intent);
            }
        });

        Button b = findViewById(R.id.generatj);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(signin.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }



}