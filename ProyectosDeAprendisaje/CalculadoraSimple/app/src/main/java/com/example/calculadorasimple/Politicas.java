package com.example.calculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Politicas extends AppCompatActivity {

    private Button btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politicas);

        this.btnMain = findViewById(R.id.btnCalculadora);

    }

    public void irMain(View view){
        Intent relacion = new Intent(this,MainActivity.class);
        startActivity(relacion);
    }
}