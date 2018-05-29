package com.example.bennymai.affiliatednonafilliatedscreen;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DatabaseError;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


import java.util.HashMap;
import java.util.Map;

public class DG_DripCoffee extends AppCompatActivity implements View.OnClickListener {
    Dialog myDialog;
    private ImageButton like_button;
    private ImageButton dislike_button;

    TextView total_Like;
    TextView total_Dislike;

    public static int likes;
    public static int dislikes = 0;
    private static final String TAG = "Testing: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dg__drip_coffee);
        myDialog = new Dialog(this);

        like_button = (ImageButton) findViewById(R.id.like);
        dislike_button = (ImageButton) findViewById(R.id.dislike);

        total_Like = (TextView) findViewById(R.id.totallike);
        total_Dislike = (TextView) findViewById(R.id.totaldislike);

        like_button.setOnClickListener(this);
        dislike_button.setOnClickListener(this);

    }
    public void ShowPopup(View v) {
        myDialog.setContentView(R.layout.activity_dg__drip_coffee);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    String temp_string = "";
    @Override
    public void onClick(View view) {

        Context context = this;
        //T Code IMPORTANT FOR FIREBASE
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("coffee_like_counter");

        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String post = dataSnapshot.getValue(String.class);
                Log.v(TAG, post); // log dont need this

                int like_num = Integer.parseInt(post); //converting
                likes = like_num + 1;
                temp_string = String.valueOf(likes);
                total_Like.setText(String.valueOf(likes));
                myRef.setValue(temp_string);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }

        });



        // T CODE ENDS

//        if (view == like_button) {
//
//            //      writeToFile(String.valueOf(likes));
//            /*startActivity(new Intent(this, ResultScreen.class));*/
//
//            if (likes == 0 && dislikes != 1) {
//                likes += 1;
//               // myRef.setValue("0");
//                total_Like.setText(String.valueOf(likes));
//            } else if (likes == 1) {
//                likes = 0;
//                total_Like.setText(String.valueOf(likes));
//            }
//        }
//        else if (view == dislike_button) {
//
//            //      writeToFile(String.valueOf(dislikes));
//            /*startActivity(new Intent (this, ResultScreen.class));*/
//
//            if (dislikes == 0 && likes != 1) {
//                dislikes += 1;
//                total_Dislike.setText(String.valueOf(dislikes));
//            } else if (dislikes == 1) {
//                dislikes = 0;
//                total_Dislike.setText(String.valueOf(dislikes));
//            }
//        }
    }

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("coffee_like_counter");


/*
    public void writeToFile(String data)
    {
        // Get the directory for the user's public pictures directory.
        final File path =
                Environment.getExternalStoragePublicDirectory
                        (
                                //Environment.DIRECTORY_PICTURES
                                Environment.DIRECTORY_DCIM + "/Users/bennymai/Desktop/"
                        );

        // Make sure the path directory exists.
        if(!path.exists())
        {
            // Make it, if it doesn't exit
            path.mkdirs();
        }

        final File file = new File(path, "like_dislike.txt");

        try
        {
            file.createNewFile();
            FileOutputStream fOut = new FileOutputStream(file);
            OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
            myOutWriter.append(data);

            myOutWriter.close();

            fOut.flush();
            fOut.close();
        }
        catch (IOException e)
        {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    } */

}