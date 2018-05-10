package com.example.bennymai.affiliatednonafilliatedscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Kim_GeneralTsosChicken extends AppCompatActivity implements View.OnClickListener{

    TextView KimFoodTruck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kim__general_tsos_chicken);

        KimFoodTruck = (TextView) findViewById(R.id.kimfoodtruck);

        findViewById(R.id.kimfoodtruck).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v==KimFoodTruck) {
            startActivity(new Intent(this, KimFoodTruck.class));
        }

    }

}