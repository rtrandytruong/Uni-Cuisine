package com.example.bennymai.affiliatednonafilliatedscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Guai on 4/19/18.
 */

public class DGDinner extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dgdinner, container, false);

        String[] dinner = {"dinner", "dinner", "dinner", "dinner"};

        ListView listView = (ListView) view.findViewById(R.id.dgdinnerlist);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, dinner);

        listView.setAdapter(listViewAdapter);

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent myintent = new Intent(getContext(), MainActivity.class);
                    startActivityForResult(myintent, 0);
                }
            }
        });*/

        return view;

    }
}
