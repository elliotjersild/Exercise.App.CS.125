package com.example.exerciseappcs125;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;

public class CalenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        CalendarView calender = (CalendarView) findViewById(R.id.calendarView2);
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            /**
             * add 1 to month variable
             */
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {

            }
        });
    }
}
