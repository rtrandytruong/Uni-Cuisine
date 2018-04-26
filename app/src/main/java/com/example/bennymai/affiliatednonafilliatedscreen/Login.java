package com.example.bennymai.affiliatednonafilliatedscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity implements View.OnClickListener{

    TextView Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Signup = (TextView) findViewById(R.id.textViewSignup);

        findViewById(R.id.textViewSignup).setOnClickListener(this);
    }

    /*@Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.textViewSignup:

                startActivity(new Intent(this, Signup.class));

                break;

        }*/

    @Override
    public void onClick(View v) {
        if (v==Signup) {
            startActivity(new Intent(this, Signup.class));
        }

    }
}


    /*private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==login) {
            startActivity(new Intent(this, ChooseCampus.class));
        }
    }
}
*/