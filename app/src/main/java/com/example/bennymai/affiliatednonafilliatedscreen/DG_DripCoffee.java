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

<<<<<<< HEAD


=======
>>>>>>> 961fd2a96082fca936000dc3513cb61425bd7b48
public class DG_DripCoffee extends AppCompatActivity implements View.OnClickListener {
    Dialog myDialog;
    private ImageButton like_button;
    private ImageButton dislike_button;

    TextView total_Like;
    TextView total_Dislike;

    public static int likes;
    public static int dislikes = 0;
    private static final String TAG = "Testing: ";
<<<<<<< HEAD


=======
>>>>>>> 961fd2a96082fca936000dc3513cb61425bd7b48

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dg__drip_coffee);
        myDialog = new Dialog(this);

        like_button = (ImageButton) findViewById(R.id.like);
        dislike_button = (ImageButton) findViewById(R.id.dislike);

        total_Like = (TextView) findViewById(R.id.totallike);
        total_Dislike = (TextView) findViewById(R.id.totaldislike);

        //T Code IMPORTANT FOR FIREBASE
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("DG_DripCoffee_Like");
        final DatabaseReference myRef2 = database.getReference("DG_DripCoffee_Dislike");


        //Like Initializer
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String post_like = dataSnapshot.getValue(String.class);
                int like_num = Integer.parseInt(post_like); //converting
                String temp_string = String.valueOf(like_num);
                total_Like.setText(String.valueOf(like_num));


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }

        });

        //Dislike Initializer
        myRef2.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String post_dislike = dataSnapshot.getValue(String.class);
                int dislike_num = Integer.parseInt(post_dislike); // converting
                total_Dislike.setText(String.valueOf(dislike_num));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });





        like_button.setOnClickListener(this);
        dislike_button.setOnClickListener(this);

    }

    /////////////////////////////////////////////////////////////////////////////
    public void ShowPopup(View v) {
        myDialog.setContentView(R.layout.activity_dg__drip_coffee);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
    /////////////////////////////////////////////////////////////////////////////////////////
    String checker_l = "usable";  // allows the user to choose like
    String checker_d = "usable";  // allows the user to choose like
    String temp_string = "";
    @Override
    public void onClick(View v) {


<<<<<<< HEAD

        Context context = this;
        //T Code IMPORTANT FOR FIREBASE
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("DG_DripCoffee_Like");
        final DatabaseReference myRef2 = database.getReference("DG_DripCoffee_Dislike");

        if (v==like_button) {
            myRef.addListenerForSingleValueEvent(new ValueEventListener() {
                 @Override
                 public void onDataChange(DataSnapshot dataSnapshot) {




                     //condition of liking for first time
                     if ((checker_l == "usable")) {
                         checker_l = "unusable";
                         checker_d = "void";

                         String post_l = dataSnapshot.getValue(String.class);
                         int like_num = Integer.parseInt(post_l); //converting
                         like_num = like_num + 1;
                         String temp_string = String.valueOf(like_num);
                         total_Like.setText(temp_string);
                         myRef.setValue(temp_string);



                     }

                    //unliking
                     else if ((checker_l=="unusable")) {
                         checker_l = "usable";
                         checker_d = "usable";

                         String post_l = dataSnapshot.getValue(String.class);
                         int like_num = Integer.parseInt(post_l); //converting
                         likes = like_num - 1;
                         temp_string = String.valueOf(likes);
                         myRef.setValue(temp_string);
                         total_Like.setText(temp_string);

                     }

                     else if (checker_d == "void") {

                         String post_dislike = dataSnapshot.getValue(String.class);
                         int dislike_num = Integer.parseInt(post_dislike); // converting
                         dislike_num = dislike_num + 0;
                         temp_string = String.valueOf(dislike_num);
                         total_Dislike.setText(String.valueOf(dislike_num));
                         myRef2.setValue(temp_string);

                     }


                 }

                 @Override
                 public void onCancelled(DatabaseError databaseError) {



                 }

                                                     }
                );
            }
        if (v==dislike_button) {
            myRef2.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
=======
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
>>>>>>> 961fd2a96082fca936000dc3513cb61425bd7b48

                    // first time dislike
                    if ((checker_d == "usable")) {
                        checker_l = "void";
                        checker_d = "unusable";

                        String post_dislike = dataSnapshot.getValue(String.class);
                        int dislike_num = Integer.parseInt(post_dislike); // converting
                        dislike_num = dislike_num + 1;
                        temp_string = String.valueOf(dislike_num);
                        total_Dislike.setText(String.valueOf(dislike_num));
                        myRef2.setValue(temp_string);


                    }
                    ///undisliking
                    else if ((checker_d == "unusable")) {
                        checker_d = "usable";
                        checker_l = "usable";

                        String post_dislike = dataSnapshot.getValue(String.class);
                        int dislike_num = Integer.parseInt(post_dislike); // converting
                        dislike_num = dislike_num - 1;
                        temp_string = String.valueOf(dislike_num);
                        total_Dislike.setText(String.valueOf(dislike_num));
                        myRef2.setValue(temp_string);



                    }

                    else if (checker_l == "void") {
                        String post_l = dataSnapshot.getValue(String.class);
                        int like_num = Integer.parseInt(post_l); //converting
                        like_num = like_num + 0;
                        String temp_string = String.valueOf(like_num);
                        total_Like.setText(temp_string);
                        myRef.setValue(temp_string);
                    }




                }



                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }

    }
}