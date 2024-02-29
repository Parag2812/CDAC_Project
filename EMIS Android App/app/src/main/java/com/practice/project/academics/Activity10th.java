package com.practice.project.academics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.practice.project.R;
import com.practice.project.entity.AcademicInfo;

public class Activity10th extends AppCompatActivity {
    TextView displaysscpercentage,displaysscyear,displaysscboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity10th);
        displaysscpercentage = findViewById(R.id.sscmarks);
        displaysscyear = findViewById(R.id.sscyear);
        displaysscboard = findViewById(R.id.sscboard);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra("academicInfo")){
            AcademicInfo academicInfo = (AcademicInfo) getIntent().getSerializableExtra("academicInfo");
            if (academicInfo != null){
                displaysscpercentage.setText(""+academicInfo.getPercentage());
                displaysscyear.setText(""+academicInfo.getYear_of_passing());
                displaysscboard.setText(""+academicInfo.getBoard());
            }
        }

    }

    }
