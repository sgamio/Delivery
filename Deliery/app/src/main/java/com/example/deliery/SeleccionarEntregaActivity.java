package com.example.deliery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class SeleccionarEntregaActivity extends AppCompatActivity {

    private RecyclerView recycleViewPedido;
    private PedidoRecycleViewAdaptador adaptadorPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_entrega);

    recycleViewPedido=(RecyclerView)findViewById(R.id.recyclePedidos);
    recycleViewPedido.setLayoutManager(new LinearLayoutManager(this));
    adaptadorPedido = new PedidoRecycleViewAdaptador(obtenerPedido());
    recycleViewPedido.setAdapter(adaptadorPedido);
    }

    public List<PedidoModelo> obtenerPedido(){
        List<PedidoModelo> pedido = new ArrayList<>();

        pedido.add(new PedidoModelo("12","sandro", "la luna ", "Surco"));
        return pedido;
    }
}
