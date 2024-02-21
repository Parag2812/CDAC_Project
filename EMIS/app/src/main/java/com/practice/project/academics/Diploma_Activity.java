package com.practice.project.academics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.practice.project.R;
import com.practice.project.entity.AcademicInfo;


public class Diploma_Activity extends AppCompatActivity {

    TextView displaydiplomapercentage,displaydiplomayear,displaydiplomaboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diploma);
        displaydiplomapercentage = findViewById(R.id.diplomamarks);
        displaydiplomayear = findViewById(R.id.diplomayear);
        displaydiplomaboard = findViewById(R.id.diplomaboard);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra("academicInfo")){
            AcademicInfo academicInfo = (AcademicInfo) getIntent().getSerializableExtra("academicInfo");
            if (academicInfo != null){
                displaydiplomapercentage.setText(""+academicInfo.getPercentage());
                displaydiplomayear.setText(""+academicInfo.getYear_of_passing());
                displaydiplomaboard.setText(""+academicInfo.getBoard());

            }
        }
    }

}