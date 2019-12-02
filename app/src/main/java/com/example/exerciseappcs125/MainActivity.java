package com.example.exerciseappcs125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button newRun = findViewById(R.id.newRun);
        Button viewRun = findViewById(R.id.viewRuns);
        newRun.setOnClickListener(unused -> newRunClicked());
        viewRun.setOnClickListener(unused -> viewRunClicked());
    }
    private void newRunClicked() {

    }
    private void viewRunClicked() {

    }
}
