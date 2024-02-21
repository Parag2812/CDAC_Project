package com.practice.project.academics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.practice.project.R;
import com.practice.project.entity.AcademicInfo;


public class PG_Activity extends AppCompatActivity {

    TextView displaypgpercentage, displaypgyear, displaypgboard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg);
        displaypgpercentage = findViewById(R.id.pgmarks);
        displaypgyear = findViewById(R.id.pgyear);
        displaypgboard = findViewById(R.id.pgboard);

        Intent intent = getIntent();
        if (intent != null) {
            AcademicInfo academicInfo = (AcademicInfo) intent.getSerializableExtra("academicInfo");
            if (academicInfo != null) {
                displaypgpercentage.setText(String.valueOf(academicInfo.getPercentage()));
                displaypgyear.setText(String.valueOf(academicInfo.getYear_of_passing()));
                displaypgboard.setText(academicInfo.getBoard());
            }
        }
    }


}



