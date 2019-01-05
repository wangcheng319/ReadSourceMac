package com.example.wangc.readsource;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.fragment.NavHostFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavFragmentThree extends Fragment {
    private View rootView;
    private Fragment fragment;

    public NavFragmentThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_nav_fragment_three, container, false);
        return  rootView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fragment = this;
        rootView.findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment).navigate(R.id.action_navFragmentThree_to_navFragmentOne);
            }
        });

        rootView.findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment).navigate(R.id.action_navFragmentThree_to_navgationTwoActivity);
            }
        });
    }
}
