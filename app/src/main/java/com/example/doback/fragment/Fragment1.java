package com.example.doback.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.doback.R;
import com.example.doback.Step01Activity;

public class Fragment1 extends Fragment {

    Button btn_first, btn_second, btn_third;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.fragment1, container, false);
        btn_first =view.findViewById(R.id.btn_first);
        btn_second = view.findViewById(R.id.btn_second);
        btn_third = view.findViewById(R.id.btn_third);

        btn_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Step01Activity.class);
                startActivity(intent);
            }
        });

        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return view;

    }
}
