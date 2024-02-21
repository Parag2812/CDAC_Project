package com.practice.project.academics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.practice.project.R;
import com.practice.project.entity.AcademicInfo;

public class Activity12Long extends AppCompatActivity {

    EditText hsceditpercentage,hscedityearofpassing,hsceditboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity12_long);
        hsceditpercentage = findViewById(R.id.hsceditpercentage);
        hscedityearofpassing = findViewById(R.id.hscedityearofpassing);
        hsceditboard = findViewById(R.id.hsceditboard);
    }
    public void hscsave_button(View view) {
        AcademicInfo academicInfo = new AcademicInfo();
        academicInfo.setPercentage(Float.parseFloat(hsceditpercentage.getText().toString()));
        academicInfo.setYear_of_passing(Integer.parseInt(hscedityearofpassing.getText().toString()));
        academicInfo.setBoard(hsceditboard.getText().toString());


        Intent intent = new Intent(this, Activity12.class);
        intent.putExtra("academicInfo", academicInfo);
        startActivity(intent);
    }

    public void hsccancel_button(View view) {
        finish();
    }
}
