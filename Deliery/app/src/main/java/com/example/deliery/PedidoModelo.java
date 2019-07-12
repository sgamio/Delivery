package com.example.deliery;

public class PedidoModelo {
    private String pedido;
    private String cliente;
    private String direccion;
    private String distrito;

    public PedidoModelo() {
    }

    public PedidoModelo(String pedido, String cliente, String direccion, String distrito) {
        this.pedido = pedido;
        this.cliente = cliente;
        this.direccion = direccion;
        this.distrito = distrito;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
}
