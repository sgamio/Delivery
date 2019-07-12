package com.example.deliery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] cursos = new String[] { "Barranco", "Benaides 1", "Miraflores", "Monterrico 2" };

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,    android.R.layout.simple_spinner_item, cursos);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner combo = (Spinner) findViewById(R.id.spinner_sucursal);
        combo.setAdapter(adaptador);
/*
        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
                Toast.makeText(MainActivity.this, "Seleccionado: " + cursos[position], Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "No ha seleccionado",    Toast.LENGTH_LONG).show();
            }
        });
*/
    }

    public void mostrar_ingreso(View view ) throws DAOException {

        Log.i("====>", "Ingresar");

        PedidoControlDAO dao = new PedidoControlDAO(getBaseContext());

        dao.eliminarTodos();


        Toast.makeText(this, "Dentro de Mostrar 1", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, OpcionesActivity.class));
    }

}
