package com.practice.project.academics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.practice.project.R;
import com.practice.project.entity.AcademicInfo;


public class Editdiploma_Activity extends AppCompatActivity {

    EditText diplomaeditpercentage,diplomaedityearofpassing,diplomaeditboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editdiploma);
        diplomaeditpercentage = findViewById(R.id.diplomaeditpercentage);
        diplomaedityearofpassing = findViewById(R.id.diplomaedityearofpassing);
        diplomaeditboard = findViewById(R.id.diplomaeditboard);
    }

    public void diplomasave_button(View view) {
        AcademicInfo academicInfo = new AcademicInfo();
        academicInfo.setPercentage(Float.parseFloat(diplomaeditpercentage.getText().toString()));
        academicInfo.setYear_of_passing(Integer.parseInt(diplomaedityearofpassing.getText().toString()));
        academicInfo.setBoard(diplomaeditboard.getText().toString());


        Intent intent = new Intent(this, Diploma_Activity.class);
        intent.putExtra("academicInfo", academicInfo);
        startActivity(intent);


    }
    public void diplomacancel_button(View view) {

        finish();
    }
}