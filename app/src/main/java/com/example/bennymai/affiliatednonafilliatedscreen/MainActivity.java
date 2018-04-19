package com.example.bennymai.affiliatednonafilliatedscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.content.Intent;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button eateries;
    private Button foodtruck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eateries = (Button) findViewById(R.id.eateries);
        foodtruck = (Button) findViewById(R.id.foodtruck);

        eateries.setOnClickListener(this);
        foodtruck.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==eateries) {
            startActivity(new Intent (this, ChooseEatery.class));
        }
        //if (v==foodtruck) {
        //    startActivity(new Intent(this, FoodTrucks.class));
        }
    }
