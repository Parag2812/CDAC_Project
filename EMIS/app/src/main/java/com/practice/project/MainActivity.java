package com.practice.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edituser, editpass;
    private Button buttonlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         edituser = findViewById(R.id.edituser);
         editpass = findViewById(R.id.editpass);
        buttonlogin = findViewById(R.id.login);

         buttonlogin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String user = edituser.getText().toString();
                 String pass = editpass.getText().toString();
                 Intent intent = new Intent(MainActivity.this, FragmentActivity1.class);
                 intent.putExtra("keyname", user);
                 intent.putExtra("keynamep", pass);
                 startActivity(intent);

             }
         });

    }


}