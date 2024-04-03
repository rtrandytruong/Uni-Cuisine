package com.example.bennymai.affiliatednonafilliatedscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class EateriesActivity extends AppCompatActivity implements View.OnClickListener {

    private Button back_button;
    private Button northside;
    private Button hans;
    private Button urban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eateries);

        northside = (Button) findViewById(R.id.northside);
        hans = (Button) findViewById(R.id.hans);
        urban = (Button) findViewById(R.id.urban);

        northside.setOnClickListener(this);
        hans.setOnClickListener(this);
        urban.setOnClickListener(this);

        //back_button = (Button) findViewById(R.id.backup); //"back" is when button id matters from the design
    }

    @Override
    public void onClick(View v) {
        if (v==northside) {
            startActivity(new Intent (this, EateriesActivity.class));
        }
        if (v==hans) {
            startActivity(new Intent (this, EateriesActivity.class));
        }
        if (v==urban) {
            startActivity(new Intent (this, EateriesActivity.class));
        }
        //if (v==foodtruck) {
        //    startActivity(new Intent(this, FoodTrucks.class));
    }
}
