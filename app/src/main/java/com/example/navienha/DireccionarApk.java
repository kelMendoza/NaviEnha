package com.example.navienha;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DireccionarApk#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DireccionarApk extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DireccionarApk() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DireccionarApk.
     */
    // TODO: Rename and change types and number of parameters
    public static DireccionarApk newInstance(String param1, String param2) {
        DireccionarApk fragment = new DireccionarApk();
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

    //declarar variables
    ImageView instagram, youtube, facebook, twitter/*, toki*/;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_direccionar_apk, container, false);
        instagram = view.findViewById(R.id.btninstagram);
        youtube = view.findViewById(R.id.btnyoutube);
        facebook = view.findViewById(R.id.btnfacebook);
        twitter = view.findViewById(R.id.btntwitter);
      /*  toki = view.findViewById(R.id.btntoki);*/

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri instagram = Uri.parse("https://www.instagram.com/maravillas_officiall/?hl=es");
                Intent intent = new Intent(Intent.ACTION_VIEW,instagram);
                startActivity(intent);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri youtube = Uri.parse("https://youtu.be/jcvSzrqH3nE");
                Intent intent = new Intent(Intent.ACTION_VIEW,youtube);
                startActivity(intent);

            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri facebook = Uri.parse("https://www.facebook.com/maravillasdelmundo19");
                Intent intent = new Intent(Intent.ACTION_VIEW,facebook);
                startActivity(intent);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri twitter = Uri.parse("https://twitter.com/UZKILAND?s=20&t=z6e0xyJn7Aa6axqz-S1niA");
                Intent intent = new Intent(Intent.ACTION_VIEW,twitter);
                startActivity(intent);
            }
        });
        /*toki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri toki = Uri.parse("io.walkietalkie");
                Intent intent = new Intent(Intent.ACTION_VIEW,toki);
                startActivity(intent);
            }
        });*/
        return view;
    }
}