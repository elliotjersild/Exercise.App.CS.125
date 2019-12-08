package com.example.exerciseappcs125;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        CalendarView calender = (CalendarView) findViewById(R.id.calendarView2);
        TextView date = (TextView) findViewById(R.id.myDate);
        TextView run = (TextView) findViewById(R.id.runTime);
        date.setVisibility(View.GONE);
        run.setVisibility(View.GONE);
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            /**
             * add 1 to month variable
             */
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                String dateToDisplay = (month + 1) + "/" + day + "/" + year;
                date.setText(dateToDisplay);
                date.setVisibility(View.VISIBLE);
            }
        });
    }
}
