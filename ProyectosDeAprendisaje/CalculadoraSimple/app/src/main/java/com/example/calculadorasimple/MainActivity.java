package com.example.calculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Enlaces o atributos para comunicarnos con la vista.
    //texto
    private EditText numero_1;
    private EditText numero_2;
    private TextView respuesta;

    //botones
    private Button btnSuma;
    private Button btnResta;
    private Button btnMultiplicacion;
    private Button btnDivicion;
    private Button btnPolitica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textos
        this.numero_1 = findViewById(R.id.editTextNumero01);
        this.numero_2 = findViewById(R.id.editTextNumero02);
        this.respuesta = findViewById(R.id.textViewResultado);
        //Botones
        this.btnSuma = findViewById(R.id.btnSuma);
        this.btnResta = findViewById(R.id.btnResta);
        this.btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        this.btnDivicion = findViewById(R.id.btnDivicion);
        this.btnPolitica = findViewById(R.id.btnPoliticas);
        //Establecer evento onclic
        this.btnSuma.setOnClickListener(this);
        this.btnResta.setOnClickListener(this);
        this.btnMultiplicacion.setOnClickListener(this);
        this.btnDivicion.setOnClickListener(this);
        this.btnPolitica.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int r;
        try {
            switch (v.getId()){
                case R.id.btnSuma:
                    r = Integer.parseInt(this.numero_1.getText().toString()) + Integer.parseInt(this.numero_2.getText().toString());
                    this.respuesta.setText(r+"");
                    break;
                case R.id.btnResta:
                    r = Integer.parseInt(this.numero_1.getText().toString()) - Integer.parseInt(this.numero_2.getText().toString());
                    this.respuesta.setText(r+"");
                    break;
                case R.id.btnMultiplicacion:
                    r = Integer.parseInt(this.numero_1.getText().toString()) * Integer.parseInt(this.numero_2.getText().toString());
                    this.respuesta.setText(r+"");
                    break;
                case R.id.btnDivicion:
                    r = Integer.parseInt(this.numero_1.getText().toString()) / Integer.parseInt(this.numero_2.getText().toString());
                    this.respuesta.setText(r+"");
                    break;
                case R.id.btnPoliticas:
                    Intent relacion = new Intent(this,Politicas.class);
                    startActivity(relacion);
                    break;
            }
        }catch (NumberFormatException e){
            Toast.makeText(this,"Los campos de texto estan vacios debe ingresar los numeros a operar",Toast.LENGTH_LONG).show();
        }
        catch (ArithmeticException e){
            Toast.makeText(this,"La divicion entre cero no esta definida.",Toast.LENGTH_LONG).show();
        }
    }
}