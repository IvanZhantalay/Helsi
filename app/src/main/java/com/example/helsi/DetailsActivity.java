package com.example.helsi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class DetailsActivity extends AppCompatActivity {

    TextView detailsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        detailsText = (TextView) findViewById(R.id.details_text);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        detailsText.setText(name);
    }
}