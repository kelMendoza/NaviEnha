package com.example.navienha;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


//import com.example.navienha.databinding.FragmentMapsBinding;


public class Maps extends Fragment {



    public Maps() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //private FragmentMapsBinding binding;
    //declarar variables
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //binding = FragmentMapsBinding.inflate(inflater, container, false);
        View view = inflater.inflate(R.layout.fragment_maps, container, false);
        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);
        btn5 = view.findViewById(R.id.btn5);
        btn6 = view.findViewById(R.id.btn6);
        btn7 = view.findViewById(R.id.btn7);
        //View root = binding.getRoot();
        //btn1 = binding.btn1;

        /*btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //new Intent(Intent.ACTION_VIEW, Uri.parse("com.google.android.apps.maps"));
                Intent intent =  getActivity().getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                startActivity(intent);
            }
        });*/
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri btn1 = Uri.parse("https://maps.app.goo.gl/nu3wjfbr8N5eAY1G9");
                Intent intent = new Intent(Intent.ACTION_VIEW,btn1);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri btn2 = Uri.parse("https://maps.app.goo.gl/SEf8xytNusxg3rY37");
                Intent intent = new Intent(Intent.ACTION_VIEW,btn2);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri btn3 = Uri.parse("https://maps.app.goo.gl/gvYrSKQmjzhNEmRY7");
                Intent intent = new Intent(Intent.ACTION_VIEW,btn3);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri btn4 = Uri.parse("https://maps.app.goo.gl/cb9WB4sa1G8UeeAw7");
                Intent intent = new Intent(Intent.ACTION_VIEW,btn4);
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri btn5 = Uri.parse("https://maps.app.goo.gl/yGTFCnmfhJx6eFhE7");
                Intent intent = new Intent(Intent.ACTION_VIEW,btn5);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri btn6 = Uri.parse("https://maps.app.goo.gl/kDQ7PSyPiVdB3yDr7");
                Intent intent = new Intent(Intent.ACTION_VIEW,btn6);
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri btn7 = Uri.parse("https://maps.app.goo.gl/gkpaYNTjDRSDBBz27");
                Intent intent = new Intent(Intent.ACTION_VIEW,btn7);
                startActivity(intent);
            }
        });
        return view;
    }

}