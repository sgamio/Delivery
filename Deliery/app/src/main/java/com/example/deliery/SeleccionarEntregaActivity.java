package com.example.deliery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

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
        List<PedidoModelo> pedidos = new ArrayList<>();
        PedidoControlDAO tabla = new PedidoControlDAO(getBaseContext());

        try {
            ArrayList<PedidoControl> resultados = tabla.obtener();

            int i = 0;
            for (PedidoControl pc : resultados){
                String pedido  = "" + pc.get_p_codigo();
                String cliente = pc.get_c_nombre();
                String direccion = pc.get_cd_direccion();
                String distrito = pc.get_cd_distrito();

                pedidos.add(new PedidoModelo(pedido,cliente, direccion, distrito));
                i++;
            }

            if (i==0) {
                Toast.makeText(this, "No existe pedidos a mostrar...!!!", Toast.LENGTH_SHORT).show();
            }

        } catch (DAOException e) {
            Log.i("GeneroMusicalBuscarAc", "====> " + e.getMessage());
        }
        return pedidos;
    }


}
