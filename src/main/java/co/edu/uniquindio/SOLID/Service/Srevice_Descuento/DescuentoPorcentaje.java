package co.edu.uniquindio.SOLID.Service.Srevice_Descuento;

import co.edu.uniquindio.SOLID.Model.Pedido;

public class DescuentoPorcentaje implements  EstrategiaDescuento{
    private String codigo;
    private double porcentaje;

    public DescuentoPorcentaje(String codigo, double porcentaje) {
        this.codigo = codigo;
        this.porcentaje = porcentaje;
    }


    public double calcularDescuento(double subtotal, Pedido pedido) {
        return subtotal * (this.porcentaje / 100.0);
    }

    public String getCodigo() {
        return codigo;
    }
    public boolean esAplicable(Pedido pedido) {
        return true;
    }
}
