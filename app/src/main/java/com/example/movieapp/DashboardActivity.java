package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashboardActivity extends AppCompatActivity {

    Button movieAdd,searchMovie,viewMovie,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        movieAdd=(Button) findViewById(R.id.addmovie);
        searchMovie=(Button) findViewById(R.id.searchmovie);
        viewMovie=(Button) findViewById(R.id.viewmovie);
        exit=(Button) findViewById(R.id.exit);

        movieAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add=new Intent(getApplicationContext(), AddMovieActivity.class);
                startActivity(add);
            }
        });
        searchMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search=new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(search);
            }
        });
        viewMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view=new Intent(getApplicationContext(),ViewActivity.class);
                startActivity(view);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exit=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(exit);
            }
        });

    }
}