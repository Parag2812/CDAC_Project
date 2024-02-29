package com.practice.project.profile;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.practice.project.R;
//import com.practice.project.entity.Student;
import com.practice.project.entity.Students;


public class ProfileFragment extends Fragment {
    TextView displayStudentID;
    TextView displayFirstName;
    TextView displayLastName;
    TextView displayGender;
    TextView displayDateofBirth;
    TextView displayEmail;
    TextView displayContactNumber;
    TextView displayAddress;
    TextView displayPassword;

    Button editprofile;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        // Find TextViews by their IDs on the inflated view
        displayStudentID = rootView.findViewById(R.id.studentID);
        displayFirstName = rootView.findViewById(R.id.firstname);
        displayLastName = rootView.findViewById(R.id.lastname);
        displayGender = rootView.findViewById(R.id.gender);
        displayDateofBirth = rootView.findViewById(R.id.dob);
        displayEmail = rootView.findViewById(R.id.email);
        displayContactNumber = rootView.findViewById(R.id.contactnumber);
        displayAddress = rootView.findViewById(R.id.address);
        displayPassword = rootView.findViewById(R.id.password);
        editprofile = rootView.findViewById(R.id.editbtn);

        // Retrieve data from Intent
        Intent intent = getActivity().getIntent();
        if (intent != null && intent.hasExtra("student")) {
            Students student = (Students) intent.getSerializableExtra("student");
            if (student != null) {
                // Set the data to the respective TextView fields
                displayStudentID.setText("Student ID - " + student.getStudentID());
                displayFirstName.setText("First Name - " + student.getFirstName());
                displayLastName.setText("Last Name - " + student.getLastName());
                displayGender.setText("Gender - " + student.getGender());
                displayDateofBirth.setText("Date of Birth: - " + student.getDateOfBirth());
                displayEmail.setText("Email: - " + student.getEmail());
                displayContactNumber.setText("Contact Number: - " + student.getContactNumber());
                displayAddress.setText("Address: - " + student.getAddress());
                displayPassword.setText("New Password: - " + student.getPassword());
            }
        }
        editprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the EditProfileActivity
                Intent editProfileIntent = new Intent(getActivity(), EditProfile.class);
                startActivity(editProfileIntent);

            }
        });
        return rootView;
    }
}
