package com.example.android.rugbyscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counterA = 0;
    int counterB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * The methods to add points to score for Team A.
     */
    public void tryA (View view){
        counterA += 5;
        displayForTeamA(counterA);
    }

    public void penaltyA (View view){
        counterA += 3;
        displayForTeamA(counterA);
    }

    public void conversionA (View view){
        counterA += 2;
        displayForTeamA(counterA);
    }

    public void dropGoalA (View view){
        counterA += 3;
        displayForTeamA(counterA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.counterA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * The methods to add points to score for Team B.
     */
    public void tryB (View view){
        counterB += 5;
        displayForTeamB(counterB);
    }

    public void penaltyB (View view){
        counterB += 3;
        displayForTeamB(counterB);
    }

    public void conversionB (View view){
        counterB += 2;
        displayForTeamB(counterB);
    }

    public void dropGoalB (View view){
        counterB += 3;
        displayForTeamB(counterB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.counterB);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Reset the scores for both teams.
     */
    public void resetScores (View view){
        counterB = 0;
        displayForTeamB(counterB);
        counterA = 0;
        displayForTeamA(counterA);
    }
}
