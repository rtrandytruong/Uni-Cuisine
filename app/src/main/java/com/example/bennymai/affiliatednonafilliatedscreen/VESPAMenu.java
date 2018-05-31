package com.example.bennymai.affiliatednonafilliatedscreen;

import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VESPAMenu extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.vespamenu, container, false);

        String[] menu = {"Caesar Side Salad", "Buffalo Chicken Pizza", "Cheeseburger Pizza", "Bacon, Chicken & Pesto"};

        ListView listView = (ListView) view.findViewById(R.id.vespamenu);

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
                    Intent myintent = new Intent(getContext(), V_CaesarSideSalad.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1) {
                    Intent myintent = new Intent(getContext(), V_BuffaloChickenPizza.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 2) {
                    Intent myintent = new Intent(getContext(), V_CheeseburgerPizza.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 3) {
                    Intent myintent = new Intent(getContext(), V_BaconChickenPesto.class);
                    startActivityForResult(myintent, 0);
                }
            }
        });
        return view;
    }
}
