package com.brenda.aprendarusso.Fragments;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;

import com.brenda.aprendarusso.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Numeros_0_a_10_Fragment extends Fragment implements View.OnClickListener{

    private NumerosFragment numerosFragment;

    private ImageButton imageButtonZero, imageButtonUm, imageButtonDois,
            imageButtonTres, imageButtonQuatro, imageButtonCinco,
            imageButtonSeis, imageButtonSete, imageButtonOito, imageButtonNove, imageButtonDez;

    ///////////// AUDIOS E BOTÕES /////////////////
    private MediaPlayer mediaPlayer;
    public AudioManager audioManager;
    public SeekBar seekVolume;
    public Button buttonVolume, buttonVoltar;
    //////////////////////////////////////////////


    public Numeros_0_a_10_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =inflater.inflate(R.layout.fragment_numeros_0_a_10_, container, false);

        imageButtonZero = view.findViewById(R.id.imageButtonZero);
        imageButtonUm = view.findViewById(R.id.imageButtonUm);
        imageButtonDois = view.findViewById(R.id.imageButtonDois);
        imageButtonTres = view.findViewById(R.id.imageButtonTres);
        imageButtonQuatro = view.findViewById(R.id.imageButtonQuatro);
        imageButtonCinco = view.findViewById(R.id.imageButtonCinco);
        imageButtonSeis = view.findViewById(R.id.imageButtonSeis);
        imageButtonSete = view.findViewById(R.id.imageButtonSete);
        imageButtonOito = view.findViewById(R.id.imageButtonOito);
        imageButtonNove = view.findViewById(R.id.imageButtonNove);
        imageButtonDez = view.findViewById(R.id.imageButtonDez);

        ////////////// BOTOES ////////////////////////
        seekVolume = view.findViewById(R.id.seekVolume);
        buttonVolume = view.findViewById(R.id.buttonVolume);
        buttonVoltar = view.findViewById(R.id.buttonVoltar);
        hideSeekVolume();

        ConstraintLayout constraintLayout = view.findViewById(R.id.constraint_0_a_10);
        constraintLayout.setOnClickListener(this);

        inicializarSeekVolume();
        ////////////////////////////////////////////////

        imageButtonZero.setOnClickListener(this);
        imageButtonUm.setOnClickListener(this);
        imageButtonDois.setOnClickListener(this);
        imageButtonTres.setOnClickListener(this);
        imageButtonQuatro.setOnClickListener(this);
        imageButtonCinco.setOnClickListener(this);
        imageButtonSeis.setOnClickListener(this);
        imageButtonSete.setOnClickListener(this);
        imageButtonOito.setOnClickListener(this);
        imageButtonNove.setOnClickListener(this);
        imageButtonDez.setOnClickListener(this);

        buttonVoltar.setOnClickListener(this);
        buttonVolume.setOnClickListener(this);

        return view;
    }


    public void hideSeekVolume(){
        seekVolume.setVisibility(View.GONE);
    }
    public void showSeekVolume() { seekVolume.setVisibility(View.VISIBLE); }


    @Override
    public void onClick(View v) {

        int flag;

        switch (v.getId()){
            case R.id.imageButtonZero:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.number_zero);
                flag = 0;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonUm:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.number_one);
                flag = 1;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonDois:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.number_two);
                flag = 2;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonTres:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.number_three);
                flag = 3;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonQuatro:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.number_four);
                flag = 4;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonCinco:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.number_five);
                flag = 5;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonSeis:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.number_six);
                flag = 6;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonSete:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.number_seven);
                flag = 7;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonOito:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.number_eight);
                flag = 8;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonNove:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.number_nine);
                flag = 9;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonDez:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.number_ten);
                flag = 10;
                efeitoImagemPressionada(flag);
                executarSom();
                break;

            case R.id.constraint_0_a_10:
                hideSeekVolume();
                break;

            case R.id.buttonVolume:
                if(seekVolume.getVisibility() == View.VISIBLE){
                    hideSeekVolume();
                }else{
                    showSeekVolume();
                }
                break;

            case R.id.buttonVoltar:
                hideSeekVolume();
                numerosFragment = new NumerosFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameNumeros, numerosFragment);
                fragmentTransaction.commit();

                break;
        }
    }

    public void efeitoImagemPressionada(int flag){
        if(flag == 0){ imageButtonZero.setAlpha(50); }

        else if(flag == 1){ imageButtonUm.setAlpha(50);}

        else if(flag == 2){ imageButtonDois.setAlpha(50); }

        else if(flag == 3){ imageButtonTres.setAlpha(50); }

        else if(flag == 4){ imageButtonQuatro.setAlpha(50); }

        else if(flag == 5){ imageButtonCinco.setAlpha(50); }

        else if(flag == 6){ imageButtonSeis.setAlpha(50); }

        else if(flag == 7){ imageButtonSete.setAlpha(50); }

        else if(flag == 8){ imageButtonOito.setAlpha(50); }

        else if(flag == 9){ imageButtonNove.setAlpha(50); }

        else if(flag == 10){ imageButtonDez.setAlpha(50); }
    }


    public void executarSom(){
        if(mediaPlayer!=null){
            mediaPlayer.start();
        }

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                imageButtonZero.setAlpha(255);
                imageButtonUm.setAlpha(255);
                imageButtonDois.setAlpha(255);
                imageButtonTres.setAlpha(255);
                imageButtonQuatro.setAlpha(255);
                imageButtonCinco.setAlpha(255);
                imageButtonSeis.setAlpha(255);
                imageButtonSete.setAlpha(255);
                imageButtonOito.setAlpha(255);
                imageButtonNove.setAlpha(255);
                imageButtonDez.setAlpha(255);
            }
        });

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mediaPlayer != null && mediaPlayer.isPlaying()){
            mediaPlayer.release();
        }
    }

    public void inicializarSeekVolume() {
        audioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        int volumeMaximo = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int volumeAtual = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        seekVolume.setMax(volumeMaximo);
        seekVolume.setProgress(volumeAtual);


        seekVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, AudioManager.FLAG_SHOW_UI);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

}
