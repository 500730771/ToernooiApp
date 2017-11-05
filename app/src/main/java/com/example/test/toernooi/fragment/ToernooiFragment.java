package com.example.test.toernooi.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.test.toernooi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToernooiFragment extends Fragment {

    private static final String TITLE = "TABTOENROOIFRAGMENT";

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_toernooi, container, false);
        return view;
    }

    public ToernooiFragment() {
        // Required empty public constructor
    }
}
