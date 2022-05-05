package com.example.navienha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class View2Sitioweb extends AppCompatActivity {
    //declarar variables
    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2_sitioweb);
        wv1 = (WebView)findViewById(R.id.wv1);

        String URL = getIntent().getStringExtra("Sitio Web");
        //permitira al user navegar en la app
        wv1.setWebViewClient(new WebViewClient());
        //abrira el sitio
        wv1.loadUrl(URL);
    }
    public void Cerrar(View view){
        finish();
    }
}