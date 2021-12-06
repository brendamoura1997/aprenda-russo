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
public class NaturezaFragment extends Fragment implements View.OnClickListener {

    private Button buttonAnimaisSelvagens, buttonAnimaisDomesticos, buttonVidaMarinha, buttonPassaros;


    private NaturezaAnimaisDomesticosFragment animaisDomesticosFragment;
    private NaturezaAnimaisSelvagensFragment animaisSelvagensFragment;
    private NaturezaVidaMarinhaFragment vidaMarinhaFragment;
    private NaturezaPassarosFragment passarosFragment;




    public NaturezaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_natureza, container, false);

        buttonAnimaisSelvagens = view.findViewById(R.id.buttonAnimaisSelvagens);
        buttonAnimaisDomesticos = view.findViewById(R.id.buttonAnimaisDomesticos);
        buttonVidaMarinha = view.findViewById(R.id.buttonVidaMarinha);
        buttonPassaros = view.findViewById(R.id.buttonPassaros);


        buttonAnimaisSelvagens.setOnClickListener(this);
        buttonAnimaisDomesticos.setOnClickListener(this);
        buttonVidaMarinha.setOnClickListener(this);
        buttonPassaros.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonAnimaisSelvagens:
                animaisSelvagensFragment = new NaturezaAnimaisSelvagensFragment();
                FragmentManager manager = getFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.frameNatureza, animaisSelvagensFragment);
                fragmentTransaction.commit();

                break;
            case R.id.buttonAnimaisDomesticos:
                animaisDomesticosFragment = new NaturezaAnimaisDomesticosFragment();
                manager = getFragmentManager();
                fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.frameNatureza, animaisDomesticosFragment);
                fragmentTransaction.commit();
                break;
            case R.id.buttonVidaMarinha:
                vidaMarinhaFragment = new NaturezaVidaMarinhaFragment();
                manager = getFragmentManager();
                fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.frameNatureza, vidaMarinhaFragment);
                fragmentTransaction.commit();
                break;
            case R.id.buttonPassaros:
                passarosFragment = new NaturezaPassarosFragment();
                manager = getFragmentManager();
                fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.frameNatureza, passarosFragment);
                fragmentTransaction.commit();
                break;

        }

    }
}
