package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class activity_message extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Intent intent = getIntent();
        String messageRecu = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView monDiffuseur = findViewById(R.id.diffuseMessage);
        monDiffuseur.setText(messageRecu);
    }
}
