package com.example.navienha;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Sonido#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Sonido extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Sonido() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Sonido.
     */
    // TODO: Rename and change types and number of parameters
    public static Sonido newInstance(String param1, String param2) {
        Sonido fragment = new Sonido();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    //Button audio;
    //ImageButton btnGato, btnPerro, btnConejo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sonido, container, false);
        /*btnGato = view.findViewById(R.id.gato);
        btnPerro = view.findViewById(R.id.perro);
        btnConejo = view.findViewById(R.id.conejo);*/

        /*MediaPlayer mp = MediaPlayer.create(Sonido.this.getActivity(), R.raw.audiogatito);
        MediaPlayer mp1 = MediaPlayer.create(Sonido.this.getActivity(), R.raw.audioperrito);
        MediaPlayer mp2 = MediaPlayer.create(Sonido.this.getActivity(), R.raw.audiogatito);*/


        /*btnGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Sonido.this.getActivity(),R.raw.audiogatito);
                mp.start();
            }
        });
        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Sonido.this.getActivity(),R.raw.audioperrito);
                mp.start();
            }
        });
        btnConejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Sonido.this.getActivity(),R.raw.audiogatito);
                mp.start();
            }
        });*/


        /*btnGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()){
                    mp.pause();
                }else{
                    mp.start();
                }
            }
        });

        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp1.isPlaying()){
                    mp1.pause();
                }else{
                    mp1.start();
                }
            }
        });

        btnConejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2.isPlaying()){
                    mp2.pause();
                }else {
                    mp2.start();
                }
            }
        });*/

        return view;
    }
   /* public void MensajeGato(View view){
        Toast.makeText(this.getActivity(), "Esto es un gatito", Toast.LENGTH_LONG).show();
    }
    public void MensajePerro(View view){
        Toast.makeText(this.getActivity(), "Esto es un perrito", Toast.LENGTH_LONG).show();
    }
    public void MensajeConejo(View view){
        Toast.makeText(this.getActivity(), "Esto es un perrito", Toast.LENGTH_LONG).show();
    }*/
}