package br.com.tavares.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {

    private EditText value1;
    private EditText value2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        value1 = (EditText) findViewById(R.id.value1);
        value2 = (EditText) findViewById(R.id.value2);
        result = (TextView) findViewById(R.id.result);
    }

    public void sum(View view) {
        try {
            float val1 = Float.parseFloat(value1.getText().toString());
            float val2 = Float.parseFloat(value2.getText().toString());
            String res = (val1 + val2) + "";

            result.setText(res);
            clearFields();
        }
        catch(NumberFormatException e) {
            System.out.println(e.getMessage());
            Toast.makeText(this, "Valor(es) inválido(s).", Toast.LENGTH_SHORT).show();
            resetResult();
        }
    }

    public void subtract(View view) {
        try {
            float val1 = Float.parseFloat(value1.getText().toString());
            float val2 = Float.parseFloat(value2.getText().toString());
            String res = (val1 - val2) + "";

            result.setText(res);
            clearFields();
        }
        catch(NumberFormatException e) {
            System.out.println(e.getMessage());
            Toast.makeText(this, "Valor(es) inválido(s).", Toast.LENGTH_SHORT).show();
            resetResult();
        }
    }

    public void multiply(View view) {
        try {
            float val1 = Float.parseFloat(value1.getText().toString());
            float val2 = Float.parseFloat(value2.getText().toString());
            String res = (val1 * val2) + "";

            result.setText(res);
            clearFields();
        }
        catch(NumberFormatException e) {
            System.out.println(e.getMessage());
            Toast.makeText(this, "Valor(es) inválido(s).", Toast.LENGTH_SHORT).show();
            resetResult();
        }
    }

    public void divide(View view) {
        try {
            float val1 = Float.parseFloat(value1.getText().toString());
            float val2 = Float.parseFloat(value2.getText().toString());

            if (val2 == 0.0f) {
                Toast.makeText(this, "Não é possível fazer uma divisão por 0 (zero).", Toast.LENGTH_SHORT).show();
                resetResult();
                clearFields();
            }
            else {
                String res = (val1 / val2) + "";
                result.setText(res);
            }

            clearFields();
        }
        catch(NumberFormatException e) {
            System.out.println(e.getMessage());
            Toast.makeText(this, "Valor(es) inválido(s).", Toast.LENGTH_SHORT).show();
            resetResult();
        }
    }

    private void clearFields() {
        value1.setText("");
        value2.setText("");
        value1.requestFocus();
    }

    private void resetResult() {
        result.setText("Digite os valores e selecione uma operação.");
    }
}
