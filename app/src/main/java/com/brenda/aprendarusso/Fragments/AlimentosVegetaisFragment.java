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
public class AlimentosVegetaisFragment extends Fragment implements View.OnClickListener {


    private AlimentosFragment alimentosFragment;

    private ImageButton imageButtonSalada, imageButtonErvilha, imageButtonCebola,
            imageButtonAlface, imageButtonBeringela, imageButtonPepino,
            imageButtonMilho, imageButtonPimenta, imageButtonCenoura,
            imageButtonRepolho, imageButtonBrocolis;



    ///////////// AUDIOS E BOTÕES /////////////////
    private MediaPlayer mediaPlayer;
    public AudioManager audioManager;
    public SeekBar seekVolume;
    public Button buttonVolume, buttonVoltar;
    //////////////////////////////////////////////

    public AlimentosVegetaisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_alimentos_vegetais, container, false);


        imageButtonSalada = view.findViewById(R.id.imageButtonSalada);
        imageButtonErvilha = view.findViewById(R.id.imageButtonErvilha);
        imageButtonCebola = view.findViewById(R.id.imageButtonCebola);
        imageButtonAlface = view.findViewById(R.id.imageButtonAlface);
        imageButtonBeringela = view.findViewById(R.id.imageButtonBeringela);
        imageButtonPepino = view.findViewById(R.id.imageButtonPepino);
        imageButtonMilho = view.findViewById(R.id.imageButtonMilho);
        imageButtonPimenta = view.findViewById(R.id.imageButtonPimenta);
        imageButtonCenoura = view.findViewById(R.id.imageButtonCenoura);
        imageButtonRepolho = view.findViewById(R.id.imageButtonRepolho);
        imageButtonBrocolis = view.findViewById(R.id.imageButtonBrocolis);


        ////////////// BOTOES ////////////////////////
        seekVolume = view.findViewById(R.id.seekVolume);
        buttonVolume = view.findViewById(R.id.buttonVolume);
        buttonVoltar = view.findViewById(R.id.buttonVoltar);
        hideSeekVolume();

        ConstraintLayout constraintLayout = view.findViewById(R.id.constraintVegetais);
        constraintLayout.setOnClickListener(this);

        inicializarSeekVolume();
        ////////////////////////////////////////////////

        imageButtonSalada.setOnClickListener(this);
        imageButtonErvilha.setOnClickListener(this);
        imageButtonCebola.setOnClickListener(this);
        imageButtonAlface.setOnClickListener(this);
        imageButtonBeringela.setOnClickListener(this);
        imageButtonPepino.setOnClickListener(this);
        imageButtonMilho.setOnClickListener(this);
        imageButtonPimenta.setOnClickListener(this);
        imageButtonCenoura.setOnClickListener(this);
        imageButtonRepolho.setOnClickListener(this);
        imageButtonBrocolis.setOnClickListener(this);
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
            case R.id.imageButtonSalada:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vegetable_salad);
                flag = 0;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonErvilha:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vegetable_pea);
                flag = 1;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonCebola:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vegetable_onion);
                flag = 2;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonAlface:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vegetable_lettuce);
                flag = 3;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonBeringela:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vegetable_eggplant);
                flag = 4;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonPepino:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vegetable_cucumber);
                flag = 5;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonMilho:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vegetable_corn);
                flag = 6;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonPimenta:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vegetable_pepper);
                flag = 7;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonCenoura:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vegetable_carrot);
                flag = 8;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonRepolho:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vegetable_cabbage);
                flag = 9;
                efeitoImagemPressionada(flag);
                executarSom();
                break;
            case R.id.imageButtonBrocolis:
                hideSeekVolume();
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vegetable_broccoli);
                flag = 10;
                efeitoImagemPressionada(flag);
                executarSom();
                break;


            case R.id.constraintVegetais:
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
                alimentosFragment = new AlimentosFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameAlimentos, alimentosFragment);
                fragmentTransaction.commit();

                break;
        }
    }

    public void efeitoImagemPressionada(int flag){
        //VERMELHO
        if(flag == 0){ imageButtonSalada.setAlpha(50); }

        else if(flag == 1){ imageButtonErvilha.setAlpha(50); }

        else if(flag == 2){ imageButtonCebola.setAlpha(50);}

        else if(flag == 3){ imageButtonAlface.setAlpha(50);}

        else if(flag == 4){ imageButtonBeringela.setAlpha(50); }

        else if(flag == 5){ imageButtonPepino.setAlpha(50); }

        else if(flag == 6){ imageButtonMilho.setAlpha(50); }

        else if(flag == 7){ imageButtonPimenta.setAlpha(50); }

        else if(flag == 8){ imageButtonCenoura.setAlpha(50); }

        else if(flag == 9){ imageButtonRepolho.setAlpha(50); }

        else if(flag == 10){ imageButtonBrocolis.setAlpha(50); }
    }


    public void executarSom(){

        if(mediaPlayer != null){
            mediaPlayer.start();
        }

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                imageButtonSalada .setAlpha(255);
                imageButtonErvilha .setAlpha(255);
                imageButtonCebola .setAlpha(255);
                imageButtonAlface .setAlpha(255);
                imageButtonBeringela .setAlpha(255);
                imageButtonPepino .setAlpha(255);
                imageButtonMilho .setAlpha(255);
                imageButtonPimenta .setAlpha(255);
                imageButtonCenoura .setAlpha(255);
                imageButtonRepolho .setAlpha(255);
                imageButtonBrocolis .setAlpha(255);
            }
        });
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
    //Icons made by <a href="https://www.flaticon.com/authors/freepik" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon"> www.flaticon.com</a>

}
