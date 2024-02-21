package com.practice.project.academics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.practice.project.R;
import com.practice.project.entity.AcademicInfo;


public class Editpg_Activity extends AppCompatActivity {

    EditText pgeditpercentage,pgedityearofpassing,pgeditboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editpg);
        pgeditpercentage = findViewById(R.id.pgeditpercentage);
        pgedityearofpassing = findViewById(R.id.pgedityearofpassing);
        pgeditboard = findViewById(R.id.pgeditboard);
    }

    public void pgsave_button(View view) {
        AcademicInfo academicInfo = new AcademicInfo();
        academicInfo.setPercentage(Float.parseFloat(pgeditpercentage.getText().toString()));
        academicInfo.setYear_of_passing(Integer.parseInt(pgedityearofpassing.getText().toString()));
        academicInfo.setBoard(pgeditboard.getText().toString());

        Intent intent = new Intent(this, PG_Activity.class);
        intent.putExtra("academicInfo", academicInfo);
        startActivity(intent);


    }

}