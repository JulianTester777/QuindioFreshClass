package co.edu.uniquindio.SOLID.Service.Srevice_Descuento;

import co.edu.uniquindio.SOLID.Model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class GestorDescuento {
    private List<EstrategiaDescuento> estrategias = new ArrayList<>();

    public GestorDescuentos() {
        estrategias.add(new DescuentoPorcentaje("DTO10", 10.0));
        estrategias.add(new DescuentoCantidadFija("DESC5000", 5000.0));
        estrategias.add(new DescuentoPorVolumen("VOL15", 5, 15.0));
    }

    public EstrategiaDescuento obtenerEstrategia(String codigo, Pedido pedido) {
        for (EstrategiaDescuento e : estrategias) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                if (pedido == null || e.esAplicable(pedido)) {
                    return e;
                }
            }
        }
        return null;
    }
}
