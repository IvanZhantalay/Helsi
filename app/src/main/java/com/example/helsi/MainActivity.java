package com.example.helsi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    int stepsCount = 1;
    TextView text;
    TextView steps;
    TextView stepsGoal;
    TextView progressPercent;
    ProgressBar stepsProgressBar;

    int goal = 100;
    float percent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text= (TextView) findViewById(R.id.steps_title);
        steps= (TextView) findViewById(R.id.steps_value);
        stepsGoal= (TextView) findViewById(R.id.steps_goal);
        progressPercent= (TextView) findViewById(R.id.progress_Bar_Percent);
        stepsProgressBar = (ProgressBar) findViewById(R.id.progress_Bar);

        steps.setText(String.valueOf(stepsCount));
        stepsGoal.setText(String.valueOf(goal));

        text.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v) {

                if (stepsCount < goal) {

                    stepsCount++;
                    steps.setText(String.valueOf(stepsCount));

                    percent = ((float) stepsCount / (float) goal) * 100;
                    progressPercent.setText(String.valueOf((int) percent));
                    stepsProgressBar.setProgress((int) percent);
                }


            }
        });
    }
}