package com.practice.project.academics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.practice.project.R;
import com.practice.project.entity.AcademicInfo;

public class EngineeringActivity extends AppCompatActivity {

    TextView displayengpercentage,displayengyear,displayengboard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);
        displayengpercentage = findViewById(R.id.engmarks);
        displayengyear = findViewById(R.id.engyear);
        displayengboard = findViewById(R.id.engboard);

        Intent intent = getIntent();
        if (intent != null) {
            AcademicInfo academicInfo = (AcademicInfo) intent.getSerializableExtra("academicInfo");
            if (academicInfo != null) {
                displayengpercentage.setText(String.valueOf(academicInfo.getPercentage()));
                displayengyear.setText(String.valueOf(academicInfo.getYear_of_passing()));
                displayengboard.setText(academicInfo.getBoard());
            }
        }
    }

}
