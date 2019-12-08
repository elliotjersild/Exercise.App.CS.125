package com.example.exerciseappcs125;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.HashMap;
import java.util.Map;

public class NewRunActivity extends AppCompatActivity {

    private String dateOfRun;

    private String timedRun;

    Map<String, String> storeRuns = new HashMap<>();

    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newrun);
        Button enter = findViewById(R.id.enterExercise);
        enter.setOnClickListener(unused -> {

            EditText date = (EditText) findViewById(R.id.dateEntered);
            EditText timeRan = (EditText) findViewById(R.id.timeOfRun);
            ConstraintLayout calender = findViewById(R.id.calenderGroup);
            String storeDate = date.toString();
            String storeRun = timeRan.toString();
            System.out.println("You entered " + storeDate + " " + storeRun);
            View chunkRun = getLayoutInflater().inflate(R.layout.chunk_run_info, calender, false);

        });

       // LinearLayout invGroup = findViewById(R.id.invitationsGroup);
        //                    invGroup.setVisibility(View.VISIBLE);
        //                    System.out.println("set Invitations as visible");
        //                    View chunkInv = getLayoutInflater().inflate(R.layout.chunk_invitations, invitations, false);
        //                    TextView address = chunkInv.findViewById(R.id.invEmail);
        //                    address.setText(email);
        //                    TextView mmode = chunkInv.findViewById(R.id.invMode);
        //                    mmode.setText(gMode + " mode");
        //                    TextView teamname = chunkInv.findViewById(R.id.TeamName);
        //                    teamname.setText(teamNames[teamm]);
        //                    Button accept = chunkInv.findViewById(R.id.accept);
        //                    Button decline = chunkInv.findViewById(R.id.decline);
        //                    accept.setOnClickListener(unused -> accept(gameID));
        //                    decline.setOnClickListener(unused -> decline(gameID));
        //
        //                    invitations.addView(chunkInv);
    }

}
