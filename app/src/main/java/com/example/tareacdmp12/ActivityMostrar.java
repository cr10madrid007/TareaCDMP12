package com.example.tareacdmp12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityMostrar extends AppCompatActivity {
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        txtResult= (TextView) findViewById(R.id.txtResultado);
        String resultado= getIntent().getStringExtra("rst");
        txtResult.setText(resultado);

    }
}