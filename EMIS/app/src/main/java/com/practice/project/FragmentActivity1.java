package com.practice.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class FragmentActivity1 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Dashboard_fragment dashboardFragment = new Dashboard_fragment();
    CurrentCourse_Fragment currentCourseFragment = new CurrentCourse_Fragment();
    AcademicsFragment academicsFragment = new AcademicsFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, dashboardFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.dashboard) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new Dashboard_fragment()).commit();
                    return true;
                } else if (itemId == R.id.currentcourse) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new CurrentCourse_Fragment()).commit();
                    return true;
                } else if (itemId == R.id.academics) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new AcademicsFragment()).commit();
                    return true;
                } else if (itemId == R.id.profile) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new ProfileFragment()).commit();
                    return true;
                }

                return false;
            }
        });




    }
}
