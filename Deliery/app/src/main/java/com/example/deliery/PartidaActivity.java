package com.example.deliery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class PartidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partida);
    }

    public void p_Patida(View view ){
        Log.i("====>", "Se registro la partida del motorizado con exito...!!!");
        Toast.makeText(this, "Se registro la partida del motorizado con exito...!!!\"", Toast.LENGTH_SHORT).show();
    }

    public void p_Regresa(View view ){
        startActivity(new Intent(this, OpcionesActivity.class));
    }
}
