package com.example.bennymai.affiliatednonafilliatedscreen;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Registration extends AppCompatActivity implements View.OnClickListener{

    private Button login;
    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        login = (Button) findViewById(R.id.login);
        signup = (Button) findViewById(R.id.signup);

        login.setOnClickListener(this);
        signup.setOnClickListener(this);
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed()
    {

        // super.onBackPressed(); // Comment this super call to avoid calling finish() or fragmentmanager's backstack pop operation.
    }

    @Override
    public void onClick(View v) {
        if (v==login) {
            startActivity(new Intent (this, Login.class));
        }
        if (v==signup) {
            startActivity(new Intent(this, Signup.class));
        }
    }
}
