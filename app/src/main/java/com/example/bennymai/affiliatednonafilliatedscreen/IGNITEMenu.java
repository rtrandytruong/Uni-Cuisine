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

public class IGNITEMenu extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.ignitemenu, container, false);

        String[] menu = {"Tri-Blend Cheeseburger", "Classic Grilled Cheese", "Bacon & Tomato Grilled Cheese", "Crispy Cod Sandwich", "BBQ Chicken Bacon Sandwich", "Philly Cheesesteak", "Portobello Philly Steak", "Chicken Tenders", "Mozzarella Sticks", "Crinkle Cut Fries"};

        ListView listView = (ListView) view.findViewById(R.id.ignitemenu);

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
                    Intent myintent = new Intent(getContext(), I_TriBlendCheeseburger.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1) {
                    Intent myintent = new Intent(getContext(), I_ClassicGrilledCheese.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 2) {
                    Intent myintent = new Intent(getContext(), I_BaconTomatoGrilledCheese.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 3) {
                    Intent myintent = new Intent(getContext(), I_CrispyCodSandwich.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 4) {
                    Intent myintent = new Intent(getContext(), I_BBQChickenBaconSandwich.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 5) {
                    Intent myintent = new Intent(getContext(), I_PhillyCheesesteak.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 6) {
                    Intent myintent = new Intent(getContext(), I_PortobelloPhillySteak.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 7) {
                    Intent myintent = new Intent(getContext(), I_ChickenTenders.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 8) {
                    Intent myintent = new Intent(getContext(), I_MozzarellaSticks.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 9) {
                    Intent myintent = new Intent(getContext(), I_CrinkleCutFries.class);
                    startActivityForResult(myintent, 0);
                }
            }
        });
        return view;
    }
}
