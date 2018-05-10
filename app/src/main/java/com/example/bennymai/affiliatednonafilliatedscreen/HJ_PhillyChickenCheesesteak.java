package com.example.bennymai.affiliatednonafilliatedscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HJ_PhillyChickenCheesesteak extends AppCompatActivity implements View.OnClickListener{

    TextView HJFoodTruck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hj__philly_chicken_cheesesteak);

        HJFoodTruck = (TextView) findViewById(R.id.hjfoodtruck);

        findViewById(R.id.hjfoodtruck).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v==HJFoodTruck) {
            startActivity(new Intent(this, HJFoodTruck.class));
        }

    }

}
