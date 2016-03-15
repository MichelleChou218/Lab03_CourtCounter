package com.example.student.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayforTeamA(int score) {
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3ForTeamA(View view) {
        scoreTeamA += 3;
        displayforTeamA(scoreTeamA);
    }

    public void add2ForTeamA(View view) {
        scoreTeamA += 2;
        displayforTeamA(scoreTeamA);
    }

    public void add1ForTeamA(View view) {
        scoreTeamA += 1;
        displayforTeamA(scoreTeamA);
    }

    public void resetScoreView(View view) {
        scoreTeamA = 0;
        displayforTeamA(scoreTeamA);
    }
}
