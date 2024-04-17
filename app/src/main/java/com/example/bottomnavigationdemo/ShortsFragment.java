package com.example.bottomnavigationdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ShortsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_shorts, container, false);

        ImageView eventImageView1 = rootView.findViewById(R.id.event_image_1);
        eventImageView1.setImageResource(R.drawable.cine_unicap);

//        ImageView eventImageView2 = rootView.findViewById(R.id.event_image_2);
//        eventImageView2.setImageResource(R.drawable.cine_unicap);


        return rootView;
    }

}