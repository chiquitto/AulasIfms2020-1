package com.example.a2398541.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText peso;
    EditText altura;
    Button btCalcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.peso);
        altura = findViewById(R.id.altura);
        btCalcular = findViewById(R.id.btCalcular);
        resultado = findViewById(R.id.resultado);

        inicializarBotao();
    }

    private void inicializarBotao() {
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
            }
        };
        btCalcular.setOnClickListener(listener);
    }

    private void calcular() {
        String pesoString = peso.getEditableText().toString();
        String alturaString = altura.getEditableText().toString();

        Double pesoDouble = Double.parseDouble(pesoString);
        Double alturaDouble = Double.parseDouble(alturaString);

        Double imc = pesoDouble / Math.pow(alturaDouble, 2);

        resultado.setText(imc.toString());
    }
}
