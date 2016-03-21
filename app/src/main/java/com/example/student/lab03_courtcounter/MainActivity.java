package com.example.student.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab03_court_counter_t);
    }

    private void displayforTeamA(int score) {
//        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
//        scoreView.setText(String.valueOf(score));
    }

    private void displayforTeamB(int score) {
//        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
//        scoreView.setText(String.valueOf(score));
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

    public void add3ForTeamB(View view) {
        scoreTeamB += 3;
        displayforTeamB(scoreTeamB);
    }

    public void add2ForTeamB(View view) {
        scoreTeamB += 2;
        displayforTeamB(scoreTeamB);
    }

    public void add1ForTeamB(View view) {
        scoreTeamB += 1;
        displayforTeamB(scoreTeamB);
    }

    public void resetScoreView(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayforTeamA(scoreTeamA);
        displayforTeamB(scoreTeamB);
    }

    public void addThreePoints(View view) {
//        CourtCounterFragment fragment_team_a =
//                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
//        fragment_team_a.m_tv_team_score.setText("3");
        LinearLayout linearLayout =(LinearLayout)view.getParent();
        TextView tv_team_score = (TextView)linearLayout.findViewById(R.id.tv_team_score);
        int score = Integer.parseInt(tv_team_score.getText().toString());
        tv_team_score.setText(String.valueOf(score+3));

    }

    public void addTwoPoints(View view) {
    }


    public void freeThrow(View view) {
    }
}
