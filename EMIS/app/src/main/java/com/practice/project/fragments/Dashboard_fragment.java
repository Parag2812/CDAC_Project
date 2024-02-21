package com.practice.project.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.practice.project.R;
import com.practice.project.entity.UserData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;


public class Dashboard_fragment extends Fragment {

    interface  RequestUser{
        @GET("/Students/{studentID}")
        Call<UserData> getUser(@Path("studentID") String uid);
    }

    TextView textview1, textview2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dashboard_fragment, container, false);

        // Find TextViews by their IDs
        textview1 = rootView.findViewById(R.id.announcemnets);
        textview2 = rootView.findViewById(R.id.notice);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8081/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestUser requestUser = retrofit.create(RequestUser.class);
        requestUser.getUser("9").enqueue(new Callback<UserData>() {

            @Override
            public void onResponse(Call<UserData> call, Response<UserData> response) {
                textview1.setText(response.body().getData().first_name);

            }

            @Override
            public void onFailure(Call<UserData> call, Throwable t) {
                textview1.setText(t.getMessage());

            }
        });


        return rootView;
    }
}
