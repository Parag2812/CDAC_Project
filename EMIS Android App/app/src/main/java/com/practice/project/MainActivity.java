package com.practice.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.practice.project.api.Retrofitclient;
import com.practice.project.entity.Students;
import com.practice.project.fragments.FragmentActivity1;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText editEmail, editPassword;
    CheckBox checkboxRememberMe;
    private Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editEmail = findViewById(R.id.edituser);
        editPassword = findViewById(R.id.editpass);
        checkboxRememberMe = findViewById(R.id.checkboxRememberMe);
        loginButton = findViewById(R.id.loginButton); // Assuming the ID of the button is loginButton

        // Set OnClickListener for loginButton
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login();
            }

            private void login() {

                Students user = new Students();

                user.setEmail(editEmail.getText().toString());
                user.setPassword(editPassword.getText().toString());


                Retrofitclient.getInstance().getApi().loginStudent(user).enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                        if (response.isSuccessful()) {
                            JsonObject jsonObject = response.body();
                            if (jsonObject != null && jsonObject.has("message")) {
                                String message = jsonObject.get("message").getAsString();
                                if ("Login successful".equals(message)) {
                                    // Extract user data from the response
                                    JsonObject userObject = jsonObject.getAsJsonObject("user");
                                    Log.e("user", userObject.toString());
                                    int studentID = userObject.get("StudentID").getAsInt();
                                    String firstName = userObject.get("FirstName").getAsString();
                                    String lastName = userObject.get("LastName").getAsString();
                                    String dateOfBirth = userObject.get("DateOfBirth").getAsString();
                                    String gender = userObject.get("Gender").getAsString();
                                    String contactNumber = userObject.get("ContactNumber").getAsString();
                                    String email = userObject.get("Email").getAsString();
                                    String address = userObject.get("Address").getAsString();
                                    int classID = userObject.get("ClassID").getAsInt();
                                    String admissionDate = userObject.get("AdmissionDate").getAsString();
                                    String password = userObject.get("Password").getAsString();

                                    // Here you can use the user data as needed, for example, save it to SharedPreferences
                                    // or pass it to the next activity via Intent

                                    // Example: Saving user email to SharedPreferences
                                    SharedPreferences.Editor editor = getSharedPreferences("UserData", MODE_PRIVATE).edit();
                                    editor.putString("email", email);
                                    editor.apply();

                                    // Example: Starting MainActivity
                                    startActivity(new Intent(MainActivity.this, FragmentActivity1.class));
                                } else {
                                    // Login failed, show appropriate message to the user
                                    Toast.makeText(MainActivity.this, "Login failed. Please check your credentials.", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                // Unexpected response format, show error message
                                Toast.makeText(MainActivity.this, "Unexpected response from server", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            // Server returned an error response
                            Toast.makeText(MainActivity.this, "Failed to communicate with server. Please try again later.", Toast.LENGTH_SHORT).show();
                        }
                    }


                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable t) {
                        Log.e("Student Login Status", "Error occurred: " + t.getLocalizedMessage());

                        Toast.makeText(MainActivity.this, "Failed to login. Please check your internet connection.", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

}
}





