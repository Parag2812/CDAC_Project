package com.practice.project.academics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.practice.project.R;
import com.practice.project.entity.AcademicInfo;

public class Activity10Long extends AppCompatActivity {
    TextView sscinfo;
    EditText ssceditpercentage,sscedityearofpassing,ssceditboard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity10_long);
        sscinfo = findViewById(R.id.sscinfo);
        ssceditpercentage = findViewById(R.id.ssceditpercentage);
        sscedityearofpassing = findViewById(R.id.sscedityearofpassing);
        ssceditboard = findViewById(R.id.ssceditboard);
    }

        public void sscsave_button(View view) {
            AcademicInfo academicInfo = new AcademicInfo();
            academicInfo.setPercentage(Float.parseFloat(ssceditpercentage.getText().toString()));
            academicInfo.setYear_of_passing(Integer.parseInt(sscedityearofpassing.getText().toString()));
            academicInfo.setBoard(ssceditboard.getText().toString());


            Intent intent = new Intent(this, Activity10th.class);
            intent.putExtra("academicInfo", academicInfo);
            startActivity(intent);

        }

        public void ssccancel_button(View view) {
            finish();
        }
    }

