package com.example.navienha;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Maravilla#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Maravilla extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Maravilla() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Maravilla.
     */
    // TODO: Rename and change types and number of parameters
    public static Maravilla newInstance(String param1, String param2) {
        Maravilla fragment = new Maravilla();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    //String maravilla;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        //String maravilla = getIntent().getStringExtra("maravilla");
    }

    //declaracion de variables
    TextView mara1, mara2, mara3, mara4, mara5, mara6, mara7;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_maravilla, container, false);


        //mara1 = view.findViewById(R.id.maravilla1);
        /*mara2 = view.findViewById(R.id.maravilla2);
        mara3 = view.findViewById(R.id.maravilla3);
        mara4 = view.findViewById(R.id.maravilla4);
        mara5 = view.findViewById(R.id.maravilla5);
        mara6 = view.findViewById(R.id.maravilla6);
        mara7 = view.findViewById(R.id.maravilla7);*/
        //String dieta = getIntent().getStringExtra("dieta");


       /* mara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Seleccion1();
            }
        });
        mara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Seleccion2();
            }
        });
        mara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Seleccion3();
            }
        });*/
        /*mara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Seleccion1();
            }
        });
        mara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Seleccion2();
            }
        });
        mara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Seleccion3();
            }
        });
        mara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Seleccion1();
            }
        });*/
        return view;
    }
    /*private void Seleccion1 ()
    {
        Intent intent = new Intent(Maravilla.this.getActivity(), Mav1Descripcion.class);
        startActivity(intent);
    }
    private void Seleccion2 ()
    {
        Intent intent = new Intent(Maravilla.this.getActivity(), Mav2.class);
        startActivity(intent);
    }
    private void Seleccion3 ()
    {
        Intent intent = new Intent(Maravilla.this.getActivity(), Mav3.class);
        startActivity(intent);
    }*/
}


    /*public void Seleccion(View view){
        switch (view.getId()){
            case R.id.mav1:
                Toast.makeText(Maravilla.this.getActivity(), "Chichén Itzá",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mav2:
                Toast.makeText(Maravilla.this.getActivity(), "Coliseo de Roma",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mav3:
                Toast.makeText(Maravilla.this.getActivity(), "Estatua del Cristo Redentor",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mav4:
                Toast.makeText(Maravilla.this.getActivity(), "Gran Muralla China",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mav5:
                Toast.makeText(Maravilla.this.getActivity(), "Machu Picchur",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mav6:
                Toast.makeText(Maravilla.this.getActivity(), "Petra",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mav7:
                Toast.makeText(Maravilla.this.getActivity(), "Taj Mahal",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }*/
