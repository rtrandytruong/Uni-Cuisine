package com.example.bennymai.affiliatednonafilliatedscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity implements View.OnClickListener{

    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup = (Button) findViewById(R.id.login);

        signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==signup) {
            startActivity(new Intent(this, ChooseCampus.class));
        }
    }
}
