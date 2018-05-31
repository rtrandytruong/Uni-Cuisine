package com.example.bennymai.affiliatednonafilliatedscreen;

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

public class SDMenu extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sdmenu, container, false);

        String[] menu = {"Turkey & Cilantro Slaw Ciabatta", "Grilled Chicken & Bacon Melt", "Croque Monsieur Melt", "Caprese Panini", "Chicken, Feta & Spinach Panini", "Broccoli Cheddar Panini", "BBQ Turkey & Cheddar Panini"};

        ListView listView = (ListView) view.findViewById(R.id.sdmenu);

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
                    Intent myintent = new Intent(getContext(), SD_TurkeyCilantroSlawCiabatta.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1) {
                    Intent myintent = new Intent(getContext(), SD_GrilledChickenBaconMelt.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 2) {
                    Intent myintent = new Intent(getContext(), SD_CroqueMonsieurMelt.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 3) {
                    Intent myintent = new Intent(getContext(), SD_CapresePanini.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 4) {
                    Intent myintent = new Intent(getContext(), SD_ChickenFetaSpinachPanini.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 5) {
                    Intent myintent = new Intent(getContext(), SD_BroccoliCheddarPanini.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 6) {
                    Intent myintent = new Intent(getContext(), SD_BbqTurkeyCheddarPanini.class);
                    startActivityForResult(myintent, 0);
                }
            }
        });
        return view;
    }
}
