package com.porcupineteam.roompals;

import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

/**
 * Created by kdandang on 4/17/2015.
 */
public class CalendarFragment extends ListFragment {

    //private final int PREVIOUS_MONTH = 0;
    //private final int NEXT_MONTH = 1;

    public CalendarFragment (){}

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        final long twoWeekMilli = 2419200000L; //how many milliseconds in 28 days
        View rootView = inflater.inflate(R.layout.fragment_calendar, container, false);

        //turned off week number in the XML layout
        //dont need these widgets activated
        //CalendarView mainCalendar = (CalendarView) rootView.findViewById(R.id.calendarView);

        Button previousMonth = (Button) rootView.findViewById(R.id.prevMonthButton);
        previousMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View root = (View) v.getParent();
                CalendarView calendar = (CalendarView) root.findViewById(R.id.calendarView);
                long date = calendar.getDate();

                Log.d("TEST", "DATE: " + String.valueOf(date));
                Log.d("TEST", "twoWeek: " + String.valueOf(twoWeekMilli));

                date = date - twoWeekMilli;

                calendar.setDate(date);

                Toast.makeText(getActivity().getApplicationContext(), String.valueOf(date), Toast.LENGTH_SHORT).show();
            }
        });

        Button nextMonth = (Button) rootView.findViewById(R.id.nextMonthButton);
        nextMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View root = (View) v.getParent();
                CalendarView calendar = (CalendarView) root.findViewById(R.id.calendarView);
                long date = calendar.getDate();

                Log.d("TEST", "DATE: " + String.valueOf(date));
                Log.d("TEST", "twoWeek: " + String.valueOf(twoWeekMilli));

                date = date + twoWeekMilli;

                calendar.setDate(date);

                Toast.makeText(getActivity().getApplicationContext(), String.valueOf(date), Toast.LENGTH_SHORT).show();
            }
        });

        //TODO - add a listener for date selected
        //TODO - Make a listview adapter for events upcoming - populated based on selected date?

        return rootView;
    }

}