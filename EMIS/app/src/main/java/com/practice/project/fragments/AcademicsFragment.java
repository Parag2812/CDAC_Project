package com.practice.project.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.project.R;
import com.practice.project.academics.Activity10Long;
import com.practice.project.academics.Activity10th;
import com.practice.project.academics.Activity12;

import com.practice.project.academics.Activity12Long;
import com.practice.project.academics.Diploma_Activity;
import com.practice.project.academics.Editdiploma_Activity;
import com.practice.project.academics.Editeng_Activity;
import com.practice.project.academics.Editpg_Activity;
import com.practice.project.academics.EngineeringActivity;
import com.practice.project.academics.PG_Activity;


public class AcademicsFragment extends Fragment implements View.OnClickListener, View.OnLongClickListener {
    public CardView card1, card2, card3 , card4, card5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_academics, container, false);


        card1 = rootView.findViewById(R.id.ten);
        card2 = rootView.findViewById(R.id.twelve);
        card3 = rootView.findViewById(R.id.diploma);
        card4 = rootView.findViewById(R.id.eng);
        card5 = rootView.findViewById(R.id.pg);

        //  click listeners
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);

        //long press listners

        card1.setOnLongClickListener(this);
        card2.setOnLongClickListener(this);
        card3.setOnLongClickListener(this);
        card4.setOnLongClickListener(this);
        card5.setOnLongClickListener(this);
        return rootView;
    }

        @Override
        public void onClick(View view) {
            Intent i;


            if (view.getId() == R.id.ten) {
                i = new Intent(getActivity(), Activity10th.class);
                startActivity(i);
            } else if (view.getId() == R.id.twelve) {
                i = new Intent(getActivity(), Activity12.class);
                startActivity(i);

            } else if (view.getId() == R.id.diploma) {
                i = new Intent(getActivity(), Diploma_Activity.class);
                startActivity(i);

            } else if (view.getId() == R.id.eng) {
                i = new Intent(getActivity(), EngineeringActivity.class);
                startActivity(i);

            } else if (view.getId() == R.id.pg) {
                i = new Intent(getActivity(), PG_Activity.class);
                startActivity(i);

            }
        }


    @Override
    public boolean onLongClick(View view) {
        Intent i = new Intent();
        // Handle long press events for the CardViews
        if (view.getId() == R.id.ten) {
            i = new Intent(getActivity(), Activity10Long.class);
            startActivity(i);


            return true;
        } else if (view.getId() == R.id.twelve) {
            i = new Intent(getActivity(), Activity12Long.class);
            startActivity(i);

            //path set kara varti jasa kelay inetent gheun //actvity banva 12 vi 10 vi chya add krnayasathi data ani
            // path varchya sarkha dya sglikde

            return true;
        } else if (view.getId() == R.id.diploma) {
            i = new Intent(getActivity(), Editdiploma_Activity.class);
            startActivity(i);

            // Handle long press on the "Diploma" CardView
            return true;
        } else if (view.getId() == R.id.eng) {
            i = new Intent(getActivity(), Editeng_Activity.class);
            startActivity(i);

            // Handle long press on the "Engineering" CardView
            return true;
        } else if (view.getId() == R.id.pg) {
            i = new Intent(getActivity(), Editpg_Activity.class);
            startActivity(i);
            // Handle long press on the "PG" CardView
            return true;
        }

        return false;
    }

}
