package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;


public class call extends Fragment {
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_call, container, false);
        RadioGroup n = (RadioGroup)view.findViewById(R.id.radio);

Button g=(Button)view.findViewById(R.id.contin);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (n.getCheckedRadioButtonId()) {
                    case R.id.radioButton7:

                        Intent intent = new Intent(getActivity(), monthly.class);
                        startActivity(intent);
                        break;

                    case R.id.radioButton8:

                        Intent go = new Intent(getActivity(), th.class);
                        startActivity(go);
                        break;

                    case R.id.radioButton74:

                        Intent intel = new Intent(getActivity(), paycu.class);
                        startActivity(intel);
                        break;

                    case R.id.radioButton86:

                        Intent inteh = new Intent(getActivity(), th.class);
                        startActivity(inteh);
                        break;
                }
                }
                });


                    return view;

    }
}