package com.example.bennymai.affiliatednonafilliatedscreen;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KamiMenu extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.kamimenu, container, false);

        String[] menu = {"Bibimbop", "Bulgogi", "Kimchi Bulgogi Hoagie", "Kimchi Fried Rice Wrap", "Spicy Chicken", "Tteokbokki"};

        ListView listView = (ListView) view.findViewById(R.id.kamimenu);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, menu);

        listView.setAdapter(listViewAdapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                if (position == 0) {
//                    Intent myintent = new Intent(getContext(), MainActivity.class);
//                    startActivityForResult(myintent, 0);
//                }
//            }
//        });
        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Intent myintent = new Intent(getContext(), DG_DripCoffee.class);
                    startActivityForResult(myintent, 0);
            }
        });

        return view;

    }
}*/
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent myintent = new Intent(getContext(), Kami_Bibimbap.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1) {
                    Intent myintent = new Intent(getContext(), Kami_Bulgogi.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 2) {
                    Intent myintent = new Intent(getContext(), Kami_KimichiBulgogiHoagie.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 3) {
                    Intent myintent = new Intent(getContext(), Kami_KimchiFriedRiceWrap.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 4) {
                    Intent myintent = new Intent(getContext(), Kami_SpicyChicken.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 5) {
                    Intent myintent = new Intent(getContext(), Kami_Tteokbokki.class);
                    startActivityForResult(myintent, 0);
                }
            }
        });
        return view;
    }
}
