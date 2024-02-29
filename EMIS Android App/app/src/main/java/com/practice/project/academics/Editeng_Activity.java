package com.practice.project.academics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.practice.project.R;
import com.practice.project.entity.AcademicInfo;


public class Editeng_Activity extends AppCompatActivity {

    EditText engeditpercentage,engedityearofpassing,engeditboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editeng);
        engeditpercentage = findViewById(R.id.engeditpercentage);
        engedityearofpassing = findViewById(R.id.engedityearofpassing);
        engeditboard = findViewById(R.id.engeditboard);
    }

    public void engsave_button(View view) {
        AcademicInfo academicInfo = new AcademicInfo();
        academicInfo.setPercentage(Float.parseFloat(engeditpercentage.getText().toString()));
        academicInfo.setYear_of_passing(Integer.parseInt(engedityearofpassing.getText().toString()));
        academicInfo.setBoard(engeditboard.getText().toString());


        Intent intent = new Intent(this, EngineeringActivity.class);
        intent.putExtra("academicInfo", academicInfo);
        startActivity(intent);


    }
    public void engcancel_button(View view) {
        finish();
    }
}