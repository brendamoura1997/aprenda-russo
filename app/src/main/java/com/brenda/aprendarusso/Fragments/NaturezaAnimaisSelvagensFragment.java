package com.brenda.aprendarusso.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.brenda.aprendarusso.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NaturezaAnimaisSelvagensFragment extends Fragment implements View.OnClickListener{


    private NaturezaFragment naturezaFragment;
    private Button buttonVoltar;
    private FrameLayout frameAnimaisSelvagens;


    public NaturezaAnimaisSelvagensFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_natureza_animais_selvagens, container, false);

        buttonVoltar = view.findViewById(R.id.buttonVoltar);
        frameAnimaisSelvagens = view.findViewById(R.id.frameAnimaisSelvagens);

        buttonVoltar.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonVoltar:
                naturezaFragment = new NaturezaFragment();
                FragmentManager manager = getFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.frameAnimaisSelvagens, naturezaFragment);
                fragmentTransaction.commit();


                break;


        }
    }
}
