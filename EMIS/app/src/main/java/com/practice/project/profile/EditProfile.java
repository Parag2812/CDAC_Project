package com.practice.project.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.practice.project.entity.Students;
import com.practice.project.fragments.FragmentActivity1;
import com.practice.project.R;
//import com.practice.project.entity.Student;

public class EditProfile extends AppCompatActivity {
    EditText editStudentID;
    EditText editFirstName;
    EditText editLastName;
    EditText editGender;
    EditText editDateofBirth;
    EditText editEmail;
    EditText editContactNumber;
    EditText editAddress;
    EditText editPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile); // Set the content view
        //editStudentID = findViewById(R.id.editStudentID);
        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editGender = findViewById(R.id.editGender);
        editDateofBirth = findViewById(R.id.editDateofBirth);
        editEmail = findViewById(R.id.editEmail);
        editContactNumber = findViewById(R.id.editContactNumber);
        editAddress = findViewById(R.id.editAddress);
        editPassword = findViewById(R.id.editPassword);
    }
    public void savepro(View view){
        Students student =  new Students();
        student.setFirstName(editFirstName.getText().toString());
        student.setLastName(editLastName.getText().toString());
        student.setGender(editGender.getText().toString());
        student.setEmail(editEmail.getText().toString());
        student.setDateOfBirth(editDateofBirth.getText().toString());
        student.setContactNumber(editContactNumber.getText().toString());
        student.setAddress(editAddress.getText().toString());
        student.setPassword(editPassword.getText().toString());

        Intent intent = new Intent(this, FragmentActivity1.class);
        intent.putExtra("student", student);
        startActivity(intent);
        //finish();
    }



    public void cancel(View view){
        finish();

    }
}






