package com.example.bennymai.affiliatednonafilliatedscreen;

import android.annotation.SuppressLint;
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

public class RandomFood extends AppCompatActivity implements View.OnClickListener {

    private Button chinese;
    private Button halal;
    private Button american;
    private Button random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        chinese = (Button) findViewById(R.id.randomchinese);
        halal = (Button) findViewById(R.id.randomhalal);
        american = (Button) findViewById(R.id.randomamerican);
        random = (Button) findViewById(R.id.idontcare);

        chinese.setOnClickListener(this);
        halal.setOnClickListener(this);
        american.setOnClickListener(this);
        random.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == chinese) {
            Random generator = new Random();
            int number = generator.nextInt(10) + 1;
            // The '5' is the number of activities

            Class activity = null;

            // Here, we are checking to see what the output of the random was
            switch (number) {
                case 1:
                    activity = Mai_ChickenRiceSoup.class;
                    break;
                case 2:
                    activity = Mai_ChickenNoodleSoup.class;
                    break;
                case 3:
                    activity = Mai_TofuVegetableSoup.class;
                    break;
                case 4:
                    activity = Mai_WontonSoup.class;
                    break;
                case 5:
                    activity = Mai_EggRoll.class;
                    break;
                case 6:
                    activity = Kim_FriedFishWithGarlicSauce.class;
                    break;
                case 7:
                    activity = Kim_FriedDumplings.class;
                    break;
                case 8:
                    activity = Kim_SesameChicken.class;
                    break;
                case 9:
                    activity = Kim_PepperSteak.class;
                    break;
                case 10:
                    activity = Kim_GeneralTsosChicken.class;
                    break;
            }
            // We use intents to start activities
            Intent intent = new Intent(getBaseContext(), activity);
            startActivity(intent);
        }
        if (v == halal) {
            Random generator = new Random();
            int number = generator.nextInt(11) + 1;
            // The '5' is the number of activities

            Class activity = null;

            // Here, we are checking to see what the output of the random was
            switch (number) {
                case 1:
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
                    activity = Halal_FalafelSalad.class;
                    break;
                case 7:
                    activity = Halal_LambGyro.class;
                    break;
                case 8:
                    activity = Halal_LambSalad.class;
                    break;
                case 9:
                    activity = Halal_ShishKebabRice.class;
                    break;
                case 10:
                    activity = Halal_ChapliKebabRice.class;
                    break;
                case 11:
                    activity = Halal_ChickenGyro.class;
                    break;
            }
            // We use intents to start activities
            Intent intent = new Intent(getBaseContext(), activity);
            startActivity(intent);
        }
        if (v == american) {
            Random generator = new Random();
            int number = generator.nextInt(4) + 1;
            // The '5' is the number of activities

            Class activity = null;

            // Here, we are checking to see what the output of the random was
            switch (number) {
                case 1:
                    activity = HJ_PepperCheesesteak.class;
                    break;
                case 2:
                    activity = HJ_MushroomCheesesteak.class;
                    break;
                case 3:
                    activity = HJ_BbqCheesesteak.class;
                    break;
                case 4:
                    activity = HJ_PhillyChickenCheesesteak.class;
                    break;
                case 5:
                    activity = HJ_PhillyCheesesteak.class;
                    break;
            }
            // We use intents to start activities
            Intent intent = new Intent(getBaseContext(), activity);
            startActivity(intent);
        }
        if (v == random) {
            Random generator = new Random();
            int number = generator.nextInt(5) + 1;
            // The '5' is the number of activities

            Class activity = null;

            // Here, we are checking to see what the output of the random was
            switch (number) {
                case 1:
                    activity = HJ_PepperCheesesteak.class;
                    break;
                case 2:
                    activity = HJ_MushroomCheesesteak.class;
                    break;
                case 3:
                    activity = HJ_BbqCheesesteak.class;
                    break;
                case 4:
                    activity = HJ_PhillyChickenCheesesteak.class;
                    break;
                case 5:
                    activity = HJ_PhillyCheesesteak.class;
                    break;
            }
            // We use intents to start activities
            Intent intent = new Intent(getBaseContext(), activity);
            startActivity(intent);
        }
        {
            Random generator = new Random();
            int number = generator.nextInt(32) + 1;
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
                case 21:
                    activity = Halal_FalafelSalad.class;
                    break;
                case 22:
                    activity = Halal_LambGyro.class;
                    break;
                case 23:
                    activity = Halal_LambSalad.class;
                    break;
                case 24:
                    activity = Halal_ShishKebabRice.class;
                    break;
                case 25:
                    activity = Halal_ChapliKebabRice.class;
                    break;
                case 26:
                    activity = Halal_ChickenGyro.class;
                    break;
                case 27:
                    activity = Kami_Bibimbap.class;
                    break;
                case 28:
                    activity = Kami_Bulgogi.class;
                    break;
                case 29:
                    activity = Kami_KimchiFriedRiceWrap.class;
                    break;
                case 30:
                    activity = Kami_KimichiBulgogiHoagie.class;
                    break;
                case 31:
                    activity = Kami_SpicyChicken.class;
                    break;
                case 32:
                    activity = Kami_Tteokbokki.class;
                    break;
            }
            // We use intents to start activities
            Intent intent = new Intent(getBaseContext(), activity);
            startActivity(intent);
        }
    }
}