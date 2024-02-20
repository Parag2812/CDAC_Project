package com.practice.project;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CurrentCourse_Fragment extends Fragment {
    CardView cardView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_current_course_, container, false);
        cardView = rootView.findViewById(R.id.cardview);
        cardView.setCardElevation(05f);
        cardView.setCardBackgroundColor(1500);



        return inflater.inflate(R.layout.fragment_current_course_, container, false);


    }
}