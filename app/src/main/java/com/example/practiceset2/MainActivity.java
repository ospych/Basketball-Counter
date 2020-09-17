package com.example.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity_a = 0;
    int quantity_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clear(View view) {
        quantity_a = 0;
        quantity_b = 0;
        displayForTeamA(quantity_a);
        displayForTeamB(quantity_b);
    }

    public void three(View view) {
        quantity_a = quantity_a + 3;
        displayForTeamA(quantity_a);
    }

    public void two(View view) {
        quantity_a = quantity_a + 2;
        displayForTeamA(quantity_a);
    }

    public void one(View view) {
        quantity_a = quantity_a + 1;
        displayForTeamA(quantity_a);
    }

    public void three_b(View view) {
        quantity_b = quantity_b + 3;
        displayForTeamB(quantity_b);
    }

    public void two_b(View view) {
        quantity_b = quantity_b + 2;
        displayForTeamB(quantity_b);
    }

    public void one_b(View view) {
        quantity_b = quantity_b + 1;
        displayForTeamB(quantity_b);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}