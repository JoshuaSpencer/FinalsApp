package com.example.a614002.finalsapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer welcome = MediaPlayer.create(getApplicationContext(), R.raw.welcome);
        welcome.start();
    }

    public void message(View view) {
        Intent myIntent = new Intent(this, Secondary.class);
        startActivity(myIntent);
    }
  }
