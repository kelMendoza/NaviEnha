package com.example.navienha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private  static final long SPLASH_SCREEN_DELAY = 3500;
    Animation topAnim, bottomAnim;
    ImageView text1, avatar, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Animacion
        topAnim = AnimationUtils.loadAnimation (this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.botton_animation);
        //lógica y diseño
        text1 = findViewById(R.id.bienvenida);
        avatar = findViewById(R.id.avatar);
        text2 = findViewById(R.id.curso);
        text3 = findViewById(R.id.nombre);
        text1.setAnimation(topAnim);
        avatar.setAnimation(topAnim);
        text2.setAnimation(bottomAnim);
        text3.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, NaviDrawer.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DELAY);
    }
}