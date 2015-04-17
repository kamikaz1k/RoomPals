package com.porcupineteam.roompals;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kdandang on 4/17/2015.
 */
public class ChoresListFragment extends ListFragment {

    public ChoresListFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_chores, container, false);

        return rootView;
    }

}
