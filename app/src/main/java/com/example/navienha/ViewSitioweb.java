package com.example.navienha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ViewSitioweb extends AppCompatActivity {
    //decalracion de variables
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_sitioweb);

        et1 = (EditText) findViewById(R.id.txtWeb);
    }


    public void Navegar(View view) {
        //se genera un nuevo intento
        Intent i = new Intent(this, View2Sitioweb.class);
        //se envia los datos
        i.putExtra("SitioWeb", et1.getText().toString());
        startActivity(i);
    }
}