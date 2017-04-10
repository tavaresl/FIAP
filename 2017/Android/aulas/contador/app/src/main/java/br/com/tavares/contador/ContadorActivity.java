package br.com.tavares.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ContadorActivity extends AppCompatActivity {

    private TextView contadorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        contadorView = (TextView) findViewById(R.id.contadorView);
        contadorView.setText(R.string.txtZero);
    }

    public void increment(View v) {
        int val = Integer.parseInt(contadorView.getText().toString());
        val++;

        contadorView.setText(String.valueOf(val));
    }

    public void decrement(View v) {
        int val = Integer.parseInt(contadorView.getText().toString());
        val--;

        contadorView.setText(String.valueOf(val));
    }

    public void reset(View v) {
        contadorView.setText(R.string.txtZero);

        Toast.makeText(this, R.string.contadorZerado, Toast.LENGTH_SHORT).show();
    }
}
