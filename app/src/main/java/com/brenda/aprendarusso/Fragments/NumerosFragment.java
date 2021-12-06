package com.brenda.aprendarusso.Fragments;


import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;

import com.brenda.aprendarusso.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumerosFragment extends Fragment implements View.OnClickListener{

    private Button buttonNumeros0a10;
    private Button buttonNumeros11a20;
    private Numeros_0_a_10_Fragment numeros_0_a_10_fragment;

    public NumerosFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);


        buttonNumeros0a10 = view.findViewById(R.id.buttonNumeros0a10);
        buttonNumeros11a20 = view.findViewById(R.id.buttonNumeros11a20);

        buttonNumeros0a10.setOnClickListener(this);
        buttonNumeros11a20.setOnClickListener(this);





        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonNumeros0a10:
                numeros_0_a_10_fragment = new Numeros_0_a_10_Fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameNumeros, numeros_0_a_10_fragment);
                fragmentTransaction.commit();



        }
    }
}
