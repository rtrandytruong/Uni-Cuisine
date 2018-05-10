package com.example.bennymai.affiliatednonafilliatedscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Mai_ChickenNoodleSoup extends AppCompatActivity implements View.OnClickListener{

    TextView MaiFoodTruck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mai__chicken_noodle_soup);

        MaiFoodTruck = (TextView) findViewById(R.id.maifoodtruck);

        findViewById(R.id.maifoodtruck).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v==MaiFoodTruck) {
            startActivity(new Intent(this, MaiFoodTruck.class));
        }

    }

}
