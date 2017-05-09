package br.com.tavares.calculadora;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler hander = new Handler();

        hander.postDelayed(new Runnable() {
            @Override
            public void run() {
                goToCalcActivity();
            }
        }, 1200);

    }

    private void goToCalcActivity() {
        Intent toCalcActivity = new Intent(this, CalcActivity.class);
        startActivity(toCalcActivity);
        finish();
    }
}
