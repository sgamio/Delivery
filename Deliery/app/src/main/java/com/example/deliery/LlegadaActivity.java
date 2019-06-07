package com.example.deliery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class LlegadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llegada);
    }

    public void p_Llegada(View view ){
        Log.i("====>", "Se registro la llegada del motorizado a la sucursal con exito...!!!");
        Toast.makeText(this, "Se registro la llegada del motorizado a la sucursal con exito...!!!", Toast.LENGTH_SHORT).show();
    }

    public void p_Regresa(View view ){
        startActivity(new Intent(this, OpcionesActivity.class));
    }

}
