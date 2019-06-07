package com.example.deliery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SeleccionarEntregaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_entrega);
    }

    public void p_Regresa(View view ){
        startActivity(new Intent(this, OpcionesActivity.class));
    }
}
