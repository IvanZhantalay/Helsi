package com.example.helsi;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity{


    TextView text;
    TextView steps;
    TextView stepsGoal;
    TextView progressPercent;
    ProgressBar stepsProgressBar;
    ImageButton runImg;
    ImageButton manImg;
    ImageButton veloImg;
    ImageButton hamburgerImg;

    int stepsCount = 1;
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

        runImg = (ImageButton) findViewById(R.id.run_img);
        manImg = (ImageButton) findViewById(R.id.man_img);
        veloImg = (ImageButton) findViewById(R.id.velo_img);
        hamburgerImg = (ImageButton) findViewById(R.id.hamburger_img);

        steps.setText(String.valueOf(stepsCount));
        stepsGoal.setText(String.valueOf(goal));

        text.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v) {
                    stepsCount++;
                    steps.setText(String.valueOf(stepsCount));
                    percent = ((float) stepsCount / (float) goal) * 100;
                    progressPercent.setText(String.valueOf((int) percent));
                    stepsProgressBar.setProgress((int) percent);
            }
        });

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override

            public void onClick(View view){

                Intent intent = new Intent (view.getContext(), DetailsActivity.class);

                   switch (view.getId()){
                       case R.id.run_img:
                            intent = new Intent (view.getContext(), DetailsActivity.class);
                            intent.putExtra("name", "Бег");
                            startActivity(intent);
                            break;
                       case R.id.man_img:
                           intent = new Intent (view.getContext(), DetailsActivity.class);
                           intent.putExtra("name", "Шаги");
                           startActivity(intent);
                           break;
                       case R.id.velo_img:
                           intent = new Intent (view.getContext(), DetailsActivity.class);
                           intent.putExtra("name", "Велосипед");
                           startActivity(intent);
                           break;
                       case R.id.hamburger_img:
                           intent = new Intent (view.getContext(), DetailsActivity.class);
                           intent.putExtra("name", "Меню");
                           startActivity(intent);
                           break;
                   }
            }
        };
        runImg.setOnClickListener(onClickListener);
        manImg.setOnClickListener(onClickListener);
        veloImg.setOnClickListener(onClickListener);
        hamburgerImg.setOnClickListener(onClickListener);


    }
}