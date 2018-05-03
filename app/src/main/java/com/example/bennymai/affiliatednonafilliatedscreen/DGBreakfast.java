package com.example.bennymai.affiliatednonafilliatedscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Guai on 4/19/18.
 */

public class DGBreakfast extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dgbreakfast, container, false);

        String[] breakfast = {"Drip Coffee", "Espresso", "Cappuccino", "Mokaccino", "Latte", "Americano", "Hot Chocolate", "Sumatra Ice Coffee", "Iced Tea", "Hot Tazo Tea", "Bagel", "Bagel with Spread", "Box & Bagel", "Muffin", "Scone", "Coffee Roll", "Danish", "Brownie", "Pound Cake", "Croissant"};

        ListView listView = (ListView) view.findViewById(R.id.dgbreakfastlist);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, breakfast);

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
                    Intent myintent = new Intent(getContext(), DG_DripCoffee.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1) {
                    Intent myintent = new Intent(getContext(), DG_DripCoffee.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 2) {
                    Intent myintent = new Intent(getContext(), MainActivity.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 3) {
                    Intent myintent = new Intent(getContext(), MainActivity.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 4) {
                    Intent myintent = new Intent(getContext(), MainActivity.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 5) {
                    Intent myintent = new Intent(getContext(), MainActivity.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 6) {
                    Intent myintent = new Intent(getContext(), MainActivity.class);
                    startActivityForResult(myintent, 0);
                }
            }
        });
        return view;
    }
}
