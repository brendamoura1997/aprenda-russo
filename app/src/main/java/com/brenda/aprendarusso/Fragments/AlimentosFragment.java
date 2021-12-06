package com.brenda.aprendarusso.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.brenda.aprendarusso.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlimentosFragment extends Fragment implements View.OnClickListener {

    private Button buttonFrutas, buttonVegetais;

    private AlimentosVegetaisFragment vegetaisFragment;
    private AlimentosFrutasFragment frutasFragment;


    public AlimentosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_alimentos, container, false);

        buttonFrutas = view.findViewById(R.id.buttonFrutas);
        buttonVegetais = view.findViewById(R.id.buttonVegetais);

        buttonFrutas.setOnClickListener(this);
        buttonVegetais.setOnClickListener(this);


        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonVegetais:
                vegetaisFragment = new AlimentosVegetaisFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameAlimentos, vegetaisFragment);
                fragmentTransaction.commit();
                break;

            case R.id.buttonFrutas:
                frutasFragment = new AlimentosFrutasFragment();
                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameAlimentos, frutasFragment);
                fragmentTransaction.commit();
                break;
        }
    }
}
