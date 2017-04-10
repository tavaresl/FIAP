package br.com.tavares.imccalculator;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IMCActivity extends AppCompatActivity {

    TextView resultView;
    EditText inputPeso, inputAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        resultView  = (TextView) findViewById(R.id.txtResultado);
        inputPeso   = (EditText) findViewById(R.id.inputPeso);
        inputAltura = (EditText) findViewById(R.id.inputAltura);

        resultView.setText("");
    }

    public void calc(View view) {
        double peso = 0.0;
        double altura = 0.0;
        double imc = 0.0;
        String resultado = "";

        System.out.println("Churros");

        if (inputPeso.getText().toString().equals("") || inputAltura.getText().toString().equals("")) {
            Toast.makeText(this, "Todos os valores são obrigatórios.", Toast.LENGTH_SHORT).show();
            return;
        }

        peso = Double.parseDouble(inputPeso.getText().toString());
        altura = Double.parseDouble(inputAltura.getText().toString());

        if (altura == 0.0 || peso == 0.0) {
            Toast.makeText(this, "Insira valores válidos! Porra!", Toast.LENGTH_SHORT).show();
            return;
        }

        imc = peso / (altura * altura);

        if (imc < 16) {
            resultado = "Magreza grave";
        }
        else if (imc < 17) {
            resultado = "Magreza moderada";
        }
        else if (imc < 18.5) {
            resultado = "Magreza leve";
        }
        else if (imc < 25) {
            resultado = "Saudável";
        }
        else if (imc < 30) {
            resultado = "Sobrepeso";
        }
        else if (imc < 35) {
            resultado = "Obesidade Grau I";
        }
        else if (imc < 40) {
            resultado = "Obesidade Grau II (severa)";
        }
        else {
            resultado = "Obesidade Grau III (mórbida)";
        }

        resultView.setText(resultado);
    }
}
