package decorator;

public abstract class IngredientesBebida implements Bebida {
    protected Bebida bebida;

    public IngredientesBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescriction() {
        return bebida.getDescriction();
    }

    @Override
    public double precio() {
        return bebida.precio();
    }
}
