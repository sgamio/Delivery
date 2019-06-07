package com.example.deliery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class EnvioInformacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envio_informacion);
    }

    public void p_EnvioInformacion(View view ){
        Log.i("====>", "Se envio la información pendiente con exito...!!!");
        Toast.makeText(this, "Se envio la información pendiente con exito...!!!", Toast.LENGTH_SHORT).show();
    }

    public void p_Regresa(View view ){
        startActivity(new Intent(this, OpcionesActivity.class));
    }

}
