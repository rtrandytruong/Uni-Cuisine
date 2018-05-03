package com.example.bennymai.affiliatednonafilliatedscreen;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DG_DripCoffee extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dg__drip_coffee);
        myDialog = new Dialog(this);
    }
    public void ShowPopup(View v) {
        myDialog.setContentView(R.layout.activity_dg__drip_coffee);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}
