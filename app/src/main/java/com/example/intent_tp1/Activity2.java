package com.example.intent_tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tv_nom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tv_nom =findViewById(R.id.textViewVl);
        Intent i =getIntent();
        String name = i.getStringExtra("nom");
        tv_nom.setText(name);
    }
}
