package com.example.deliery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PedidoRecycleViewAdaptador extends RecyclerView.Adapter<PedidoRecycleViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView pedido, cliente, direccion, distrito;

        public ViewHolder(View itemView){
            super(itemView);
            pedido = (TextView)itemView.findViewById(R.id.tv_Pedido);
            cliente = (TextView)itemView.findViewById(R.id.tv_Cliente);
            direccion = (TextView)itemView.findViewById(R.id.tv_Direccion);
            distrito = (TextView)itemView.findViewById(R.id.tv_Distrito);
        }
    }

    public List<PedidoModelo> pedidoLista;

    public PedidoRecycleViewAdaptador(List<PedidoModelo> pedidoLista) {
        this.pedidoLista = pedidoLista;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pedido, parent, false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.pedido.setText(pedidoLista.get(position).getPedido());
        holder.cliente.setText(pedidoLista.get(position).getCliente());
        holder.direccion.setText(pedidoLista.get(position).getDireccion());
        holder.distrito.setText(pedidoLista.get(position).getDistrito());
    }

    @Override
    public int getItemCount() {
        return pedidoLista.size();
    }
}
