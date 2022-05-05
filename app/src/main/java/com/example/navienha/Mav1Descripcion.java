package com.example.navienha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Mav1Descripcion extends AppCompatActivity {

    TextView txt1, txt2;
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        txt1 = findViewById(R.id.textViewTitulo);
        txt2 = findViewById(R.id.textView3);
        img1 = findViewById(R.id.imageView3);
    }
}