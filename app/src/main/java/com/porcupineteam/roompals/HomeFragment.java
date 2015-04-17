package com.porcupineteam.roompals;

/**
 * Created by kdandang on 4/16/2015.
 */

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends ListFragment {

    public String labelText;

    public HomeFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        TextView label = (TextView) rootView.findViewById(R.id.txtLabel);
        label.setText(labelText);
        return rootView;
    }
}