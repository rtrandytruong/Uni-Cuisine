package com.example.bennymai.affiliatednonafilliatedscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
private ImageView logo ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        logo = findViewById(R.id.logo);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.transition);
        logo.startAnimation(myanim);

        final Intent i = new Intent(this,Registration.class);
        Thread timer =  new Thread() {
            public void run () {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        }; timer.start();
    }
}
