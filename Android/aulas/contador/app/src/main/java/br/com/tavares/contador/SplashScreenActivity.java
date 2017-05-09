package br.com.tavares.contador;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                goToContadorActivity();
            }
        }, 1500);
    }

    private void goToContadorActivity() {
        Intent toContadorActivity = new Intent(this, ContadorActivity.class);

        startActivity(toContadorActivity);
        finish();
    }
}
