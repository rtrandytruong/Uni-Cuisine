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

        String[] breakfast = {"Drip Coffee", "Espresso", "Cappuccino", "Mokaccino", "Latte", "Americano", "Hot Chocolate", "Sumatra Ice Coffee", "Iced Tea", "Hot Tazo Tea", "Bagel", "Bagel with Spread", "Lox & Bagel", "Muffin", "Scone", "Coffee Roll", "Danish", "Brownie", "Pound Cake", "Croissant"};

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
                    Intent myintent = new Intent(getContext(), DG_Expresso.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 2) {
                    Intent myintent = new Intent(getContext(), DG_Cappuccino.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 3) {
                    Intent myintent = new Intent(getContext(), DG_Mokaccino.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 4) {
                    Intent myintent = new Intent(getContext(), DG_Latte.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 5) {
                    Intent myintent = new Intent(getContext(), DG_Americano.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 6) {
                    Intent myintent = new Intent(getContext(), DG_HotChocolate.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 7) {
                    Intent myintent = new Intent(getContext(), DG_SumatraIcedTea.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 8) {
                    Intent myintent = new Intent(getContext(), DG_IcedTea.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 9) {
                    Intent myintent = new Intent(getContext(), DG_HotTazoTea.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 10) {
                    Intent myintent = new Intent(getContext(), DG_Bagel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 11) {
                    Intent myintent = new Intent(getContext(), DG_BagelwithSpread.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 12) {
                    Intent myintent = new Intent(getContext(), DG_LoxBagel.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 13) {
                    Intent myintent = new Intent(getContext(), DG_Muffin.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 14) {
                    Intent myintent = new Intent(getContext(), DG_Scone.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 15) {
                    Intent myintent = new Intent(getContext(), DG_CoffeeRoll.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 16) {
                    Intent myintent = new Intent(getContext(), DG_Danish.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 17) {
                    Intent myintent = new Intent(getContext(), DG_Brownie.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 18) {
                    Intent myintent = new Intent(getContext(), DG_PoundCake.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 19) {
                    Intent myintent = new Intent(getContext(), DG_Croissant.class);
                    startActivityForResult(myintent, 0);
                }
            }
        });
        return view;
    }
}
