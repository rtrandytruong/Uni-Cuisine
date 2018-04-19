package com.example.bennymai.affiliatednonafilliatedscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ChooseCampus extends AppCompatActivity implements View.OnClickListener{

    private Button drexel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_campus);

        drexel = (Button) findViewById(R.id.drexel);

        drexel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==drexel) {
            startActivity(new Intent (this, MainActivity.class));
        }
    }
}
