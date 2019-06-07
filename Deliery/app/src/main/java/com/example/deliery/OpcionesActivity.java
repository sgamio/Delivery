package com.example.deliery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class OpcionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
    }

    public void mostrar_sincronizzcion(View view ){
        Log.i("====>", "Sincronizacion");
        //Toast.makeText(this, "Sincronizacion", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, SincronizacionActivity.class));
    }

    public void mostrar_partida(View view ){
        Log.i("====>", "Partida");
        //Toast.makeText(this, "Partida", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, PartidaActivity.class));
    }

    public void mostrar_seleccion(View view ){
        Log.i("====>", "Seleccion");
        //Toast.makeText(this, "Seleccion", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, SeleccionarEntregaActivity.class));
    }

    public void mostrar_entrega(View view ){
        Log.i("====>", "Entrega");
        //Toast.makeText(this, "Entrega", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, EntregaPedidoActivity.class));
    }

    public void mostrar_envio_informacion(View view ){
        Log.i("====>", "Envio Informacion");
        //Toast.makeText(this, "Envio Informacion", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, EnvioInformacionActivity.class));
    }

    public void mostrar_llegada(View view ){
        Log.i("====>", "llegada");
        //Toast.makeText(this, "llegada", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, LlegadaActivity.class));
    }

    public void mostrar_salida_refrigerio(View view ){
        Log.i("====>", "Salida Refrigerio");
        //Toast.makeText(this, "Salida Refrigerio", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, SalidaRefrigerioActivity.class));
    }

    public void mostrar_retorno_refrigerio(View view ){
        Log.i("====>", "Retorno Refrigerio");
        //Toast.makeText(this, "Retorno Refrigerio", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, RetornoRefrigerioActivity.class));
    }

    public void mostrar_reporte_liquidacion(View view ){
        Log.i("====>", "Reporte Liuidacion");
        //Toast.makeText(this, "Reporte Liquidacion", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, ReporteLiquidacionActivity.class));
    }

    public void mostrar_salida(View view ){
        Log.i("====>", "Salida");
        //Toast.makeText(this, "Salida", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, SalirActivity.class));
    }

}
