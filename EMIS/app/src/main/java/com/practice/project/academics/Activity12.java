package com.practice.project.academics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.practice.project.R;
import com.practice.project.entity.AcademicInfo;

public class Activity12 extends AppCompatActivity {
    TextView displayhscpercentage, displayhscyear, displayhscboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);
        displayhscpercentage = findViewById(R.id.hscmarks);
        displayhscyear = findViewById(R.id.hscyear);
        displayhscboard = findViewById(R.id.hscboard);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra("academicInfo")) {
            AcademicInfo academicInfo = (AcademicInfo) getIntent().getSerializableExtra("academicInfo");
            if (academicInfo != null) {
                displayhscpercentage.setText("" + academicInfo.getPercentage());
                displayhscyear.setText("" + academicInfo.getYear_of_passing());
                displayhscboard.setText("" + academicInfo.getBoard());

            }
        }
    }
}