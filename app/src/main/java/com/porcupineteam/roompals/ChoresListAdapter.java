package com.porcupineteam.roompals;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by kdandang on 4/17/2015.
 */
public class ChoresListAdapter extends BaseAdapter {

    private Context context;
    private String[] chores;

    public ChoresListAdapter(Context appContext, String[] list){

        context = appContext;
        chores = list;

    }

    @Override
    public int getCount() {
        return chores.length;
    }

    @Override
    public Object getItem(int position) {
        return chores[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d("AAA", "mInflater starting");

        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        Log.d("AAA", "inflating starting");

        convertView = mInflater.inflate(R.layout.chore_list_item,parent,false);

        Log.d("AAA", "making textview");

        TextView choreItem = (TextView) convertView.findViewById(R.id.choreListItem);
        choreItem.setText(chores[position]);

        Log.d("AAA", "text set");

        return convertView;
    }
}
