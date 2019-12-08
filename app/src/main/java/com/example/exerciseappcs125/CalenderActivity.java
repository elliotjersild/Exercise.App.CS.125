package com.example.exerciseappcs125;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class CalenderActivity extends AppCompatActivity {
    //private NewRunActivity runActivity = new NewRunActivity();
    private Map<String, String> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        CalendarView calender = (CalendarView) findViewById(R.id.calendarView2);
        TextView date = (TextView) findViewById(R.id.myDate);
        TextView run = (TextView) findViewById(R.id.runTime);
        date.setVisibility(View.GONE);
        run.setVisibility(View.GONE);
        Intent intent = getIntent();
        String date1 = intent.getStringExtra("Date");
        String run1 = intent.getStringExtra("Run");


        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            /**
             * add 1 to month variable
             */
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                String dateToDisplay = (month + 1) + "/" + day + "/" + year;
                //updateMap();
                System.out.println("date to display: " + dateToDisplay);
                System.out.println("Map in calender " + NewRunActivity.storeRuns.keySet() + " " +
                        NewRunActivity.storeRuns.entrySet());
                for (Map.Entry<String, String> entry : NewRunActivity.storeRuns.entrySet()) {
                    System.out.println("Before if statement");

                    if (entry.getKey().equals(dateToDisplay)) {
                        run.setText(entry.getValue());
                        run.setVisibility(View.VISIBLE);
                        date.setText(dateToDisplay);
                        date.setVisibility(View.VISIBLE);
                        System.out.println("String date" + dateToDisplay + "Map date:" +
                                entry.getKey() + "Time ran " + entry.getValue());
                    } else {
                        date.setText("Did not run on this date.");
                        run.setVisibility(View.GONE);
                    }
                }
            }
        });
    }
    /**
    public void updateMap() {
        Intent intent = getIntent();
        String date = intent.getStringExtra("Date");
        String run = intent.getStringExtra("Run");
        storeRuns.put(date, run);
    } */
}
