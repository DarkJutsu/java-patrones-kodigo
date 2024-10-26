package decorator.ejercicio1._class;

import decorator.ejercicio1._abstract.IngredientesBebida;
import decorator.ejercicio1._interface.Bebida;

public class Leche extends IngredientesBebida {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con leche";
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 0.50;
    }
}
