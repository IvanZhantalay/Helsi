package com.example.helsi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView text;
    TextView steps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text= (TextView) findViewById(R.id.steps_title);
        steps= (TextView) findViewById(R.id.steps_value);

        steps.setText(String.valueOf(count));

        text.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v) {
              count++;
              steps.setText(String.valueOf(count));
            }
        });
    }
}