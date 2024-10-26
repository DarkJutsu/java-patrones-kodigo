package decorator.ejercicio1._class;

import decorator.ejercicio1._abstract.IngredientesBebida;
import decorator.ejercicio1._interface.Bebida;

public class Azucar extends IngredientesBebida {
    public Azucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con azucar";
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 0.15;
    }
}
