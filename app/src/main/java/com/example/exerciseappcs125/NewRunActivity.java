package com.example.exerciseappcs125;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewRunActivity extends AppCompatActivity {

    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newrun);
        Button enter = findViewById(R.id.enterExercise);
        enter.setOnClickListener(unused -> System.out.println("Enters the user data"));

    }
}
