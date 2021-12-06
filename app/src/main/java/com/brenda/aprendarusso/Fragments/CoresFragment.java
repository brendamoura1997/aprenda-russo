package com.brenda.aprendarusso.Fragments;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;

import com.brenda.aprendarusso.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CoresFragment extends Fragment implements View.OnClickListener {

    private ImageButton  imageButtonVermelho, imageButtonAmarelo, imageButtonAzul,
                        imageButtonVerde, imageButtonLaranja, imageButtonVioleta,
                        imageButtonPreto, imageButtonBranco, imageButtonCinza,
                        imageButtonBege, imageButtonMarrom, imageButtonRosa;


    ///////////// AUDIOS E BOTÕES /////////////////
    private MediaPlayer mediaPlayer;
    public AudioManager audioManager;
    public SeekBar seekVolume;
    public Button buttonVolume;
    //////////////////////////////////////////////

    public CoresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cores, container, false);

        imageButtonVermelho = view.findViewById(R.id.imageButtonVermelho);
        imageButtonAmarelo = view.findViewById(R.id.imageButtonAmarelo);
        imageButtonAzul = view.findViewById(R.id.imageButtonAzul);
        imageButtonVerde = view.findViewById(R.id.imageButtonVerde);
        imageButtonLaranja = view.findViewById(R.id.imageButtonLaranja);
        imageButtonVioleta = view.findViewById(R.id.imageButtonVioleta);
        imageButtonPreto = view.findViewById(R.id.imageButtonPreto);
        imageButtonBranco = view.findViewById(R.id.imageButtonBranco);
        imageButtonCinza = view.findViewById(R.id.imageButtonCinza);
        imageButtonBege = view.findViewById(R.id.imageButtonBege);
        imageButtonMarrom = view.findViewById(R.id.imageButtonMarrom);
        imageButtonRosa = view.findViewById(R.id.imageButtonRosa);

        ////////////// BOTOES ////////////////////////
        seekVolume = view.findViewById(R.id.seekVolume);
        buttonVolume = view.findViewById(R.id.buttonVolume);
        hideSeekVolume();

        ConstraintLayout constraintLayout = view.findViewById(R.id.constraintCores);
        constraintLayout.setOnClickListener(this);

        inicializarSeekVolume();
        ////////////////////////////////////////////////

        imageButtonVermelho.setOnClickListener(this);
        imageButtonAmarelo.setOnClickListener(this);
        imageButtonAzul.setOnClickListener(this);
        imageButtonVerde.setOnClickListener(this);
        imageButtonLaranja.setOnClickListener(this);
        imageButtonVioleta.setOnClickListener(this);
        imageButtonPreto.setOnClickListener(this);
        imageButtonBranco.setOnClickListener(this);
        imageButtonCinza.setOnClickListener(this);
        imageButtonBege.setOnClickListener(this);
        imageButtonMarrom.setOnClickListener(this);
        imageButtonRosa.setOnClickListener(this);
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

        switch(v.getId()){
            case R.id.imageButtonVermelho:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_red);
                flag = 0;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonAmarelo:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_yellow);
                flag = 1;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonAzul:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_blue);
                flag = 2;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonVerde:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_green);
                flag = 3;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonLaranja:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_orange);
                flag = 4;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonVioleta:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_violet);
                flag = 5;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonPreto:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_black);
                flag = 6;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonBranco:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_white);
                flag = 7;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonCinza:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_gray);
                flag = 8;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonBege:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_beige);
                flag = 9;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonMarrom:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_brown);
                flag = 10;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonRosa:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.color_pink);
                flag = 11;
                efeitoImagemPressionada(flag);
                executarSom();
                break;


            case R.id.constraintCores:
                hideSeekVolume();
                break;

            case R.id.buttonVolume:
                if(seekVolume.getVisibility() == View.VISIBLE){
                    hideSeekVolume();
                }else{
                    showSeekVolume();
                }
                break;

        }

    }

    public void efeitoImagemPressionada(int flag){
        //VERMELHO
        if(flag == 0){ imageButtonVermelho.setAlpha(50); }

        else if(flag == 1){ imageButtonAmarelo.setAlpha(50); }

        else if(flag == 2){ imageButtonAzul.setAlpha(50);}

        else if(flag == 3){ imageButtonVerde.setAlpha(50);}

        else if(flag == 4){ imageButtonLaranja.setAlpha(50); }

        else if(flag == 5){ imageButtonVioleta.setAlpha(50); }

        else if(flag == 6){ imageButtonPreto.setAlpha(50); }

        else if(flag == 7){ imageButtonBranco.setAlpha(50); }

        else if(flag == 8){ imageButtonCinza.setAlpha(50); }

        else if(flag == 9){ imageButtonBege.setAlpha(50); }

        else if(flag == 10){ imageButtonMarrom.setAlpha(50); }

        else if(flag == 11){ imageButtonRosa.setAlpha(50); }
    }


    public void executarSom(){

        if(mediaPlayer != null){
            mediaPlayer.start();
        }

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                imageButtonVermelho.setAlpha(255);
                imageButtonAmarelo.setAlpha(255);
                imageButtonAzul.setAlpha(255);
                imageButtonVerde.setAlpha(255);
                imageButtonLaranja.setAlpha(255);
                imageButtonVioleta.setAlpha(255);
                imageButtonPreto.setAlpha(255);
                imageButtonBranco.setAlpha(255);
                imageButtonCinza.setAlpha(255);
                imageButtonBege.setAlpha(255);
                imageButtonMarrom.setAlpha(255);
                imageButtonRosa.setAlpha(255);
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


