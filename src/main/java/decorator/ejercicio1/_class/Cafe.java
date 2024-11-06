package decorator.ejercicio1._class;

import decorator.ejercicio1._interface.Bebida;

public class Cafe implements Bebida {
    @Override
    public double getPrecio() {
        return 1.00;
    }

    @Override
    public String getDescription() {
        return "Cafe";
    }
}
