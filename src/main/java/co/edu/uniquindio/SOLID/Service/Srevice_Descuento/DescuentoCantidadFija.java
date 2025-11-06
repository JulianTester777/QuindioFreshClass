package co.edu.uniquindio.SOLID.Service.Srevice_Descuento;

import co.edu.uniquindio.SOLID.Model.Pedido;

public class DescuentoCantidadFija implements EstrategiaDescuento{
    private String codigo;
    private double cantidadFija;

    public DescuentoCantidadFija(String codigo, double cantidadFija) {
        this.codigo = codigo;
        this.cantidadFija = cantidadFija;
    }

    @Override
    public double calcularDescuento(double subtotal, Pedido pedido) {
        return Math.min(subtotal, this.cantidadFija);
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public boolean esAplicable(Pedido pedido) {
        return true;
    }
}
