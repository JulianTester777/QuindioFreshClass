package co.edu.uniquindio.SOLID.Service.Srevice_Descuento;

import co.edu.uniquindio.SOLID.Model.Pedido;

public class DescuentoPorVolumen implements EstrategiaDescuento{
    private String codigo;
    private int cantidadMinima;
    private double porcentaje;

    public DescuentoPorVolumen(String codigo, int cantidadMinima, double porcentaje) {
        this.codigo = codigo;
        this.cantidadMinima = cantidadMinima;
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularDescuento(double subtotal, Pedido pedido) {
        return subtotal * (this.porcentaje / 100.0);
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public boolean esAplicable(Pedido pedido) {
        return pedido.getTotalItems() > this.cantidadMinima;
    }
}
