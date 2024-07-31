package com.example.thanking_skills.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.thanking_skills.R;

public class Splash_screen extends AppCompatActivity {

    private static final long SPLASH_DELAY = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_secreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent to start the main activity
                Intent intent = new Intent(Splash_screen.this, MainActivity.class);
                startActivity(intent);

                // Finish the splash activity so it cannot be returned to
                finish();
            }
        }, SPLASH_DELAY);
    }
}



