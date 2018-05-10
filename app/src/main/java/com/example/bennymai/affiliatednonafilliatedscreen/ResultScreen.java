package com.example.bennymai.affiliatednonafilliatedscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultScreen extends AppCompatActivity {

    DG_DripCoffee res;
    TextView likes;
    TextView dislikes;

    public int l = 0;
    public int d = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        likes = (TextView) findViewById(R.id.likes_view);
        dislikes = (TextView) findViewById(R.id.dislikes_view);
        l += 1;
        //d += 1;
        likes.setText(String.valueOf(l));
        dislikes.setText(String.valueOf(d));
    }
}