package com.example.bennymai.affiliatednonafilliatedscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.content.Intent;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {




    private Button eateries;
    private Button foodtruck;
    private Button randomfood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eateries = (Button) findViewById(R.id.eateries);
        foodtruck = (Button) findViewById(R.id.foodtruck);
        randomfood = (Button) findViewById(R.id.randomfood);

        eateries.setOnClickListener(this);
        foodtruck.setOnClickListener(this);
        randomfood.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == eateries) {
            startActivity(new Intent(this, ChooseEatery.class));
        }
        if (v == foodtruck) {
            startActivity(new Intent(this, FoodTrucks.class));
        }
        if (v == randomfood) {
            Random generator = new Random();
            int number = generator.nextInt(20) + 1;
            // The '5' is the number of activities

            Class activity = null;

            // Here, we are checking to see what the output of the random was
            switch(number) {
                case 1:
                    // E.g., if the output is 1, the activity we will open is ActivityOne.class
                    activity = Halal_FishOverRice.class;
                    break;
                case 2:
                    activity = Halal_FalafelRice.class;
                    break;
                case 3:
                    activity = Halal_ComboOverRice.class;
                    break;
                case 4:
                    activity = Halal_LambOverRice.class;
                    break;
                case 5:
                    activity = Halal_ChickenOverRice.class;
                    break;
                case 6:
                    activity = HJ_PepperCheesesteak.class;
                    break;
                case 7:
                    activity = HJ_MushroomCheesesteak.class;
                    break;
                case 8:
                    activity = HJ_BbqCheesesteak.class;
                    break;
                case 9:
                    activity = HJ_PhillyChickenCheesesteak.class;
                    break;
                case 10:
                    activity = HJ_PhillyCheesesteak.class;
                    break;
                case 11:
                    activity = Mai_ChickenRiceSoup.class;
                    break;
                case 12:
                    activity = Mai_ChickenNoodleSoup.class;
                    break;
                case 13:
                    activity = Mai_TofuVegetableSoup.class;
                    break;
                case 14:
                    activity = Mai_WontonSoup.class;
                    break;
                case 15:
                    activity = Mai_EggRoll.class;
                    break;
                case 16:
                    activity = Kim_FriedFishWithGarlicSauce.class;
                    break;
                case 17:
                    activity = Kim_FriedDumplings.class;
                    break;
                case 18:
                    activity = Kim_SesameChicken.class;
                    break;
                case 19:
                    activity = Kim_PepperSteak.class;
                    break;
                case 20:
                    activity = Kim_GeneralTsosChicken.class;
                    break;
            }
            // We use intents to start activities
            Intent intent = new Intent(getBaseContext(), activity);
            startActivity(intent);
        }
    }
}