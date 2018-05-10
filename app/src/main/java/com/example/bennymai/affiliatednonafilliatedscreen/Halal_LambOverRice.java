package com.example.bennymai.affiliatednonafilliatedscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Halal_LambOverRice extends AppCompatActivity implements View.OnClickListener{

    TextView HalalTaste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halal__lamb_over_rice);

        HalalTaste = (TextView) findViewById(R.id.halalfood);

        findViewById(R.id.halalfood).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v==HalalTaste) {
            startActivity(new Intent(this, HalalFoodTruck.class));
        }

    }

}
