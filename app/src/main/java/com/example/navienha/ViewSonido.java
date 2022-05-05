package com.example.navienha;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ViewSonido extends AppCompatActivity {

    ImageButton btnGato, btnPerro, btnConejo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_sonido);

        MediaPlayer mp = MediaPlayer.create(ViewSonido.this, R.raw.audiogatito);
        MediaPlayer mp1 = MediaPlayer.create(ViewSonido.this, R.raw.audioperrito);
        MediaPlayer mp2 = MediaPlayer.create(ViewSonido.this, R.raw.audiogatito);

        btnGato.setOnClickListener(new View.OnClickListener() {
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
        });
    }

    public void MensajeGato(View view){
        Toast.makeText(this, "Esto es un gatito", Toast.LENGTH_LONG).show();
    }
    public void MensajePerro(View view){
        Toast.makeText(this, "Esto es un perrito", Toast.LENGTH_LONG).show();
    }
}

