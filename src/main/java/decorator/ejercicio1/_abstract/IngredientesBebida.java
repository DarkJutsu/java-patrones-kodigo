package decorator.ejercicio1._abstract;

import decorator.ejercicio1._interface.Bebida;

public abstract class IngredientesBebida implements Bebida{
    protected Bebida bebida;

    public IngredientesBebida(Bebida bebida){
        this.bebida=bebida;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription();
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio();
    }
}
