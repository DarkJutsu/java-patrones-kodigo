package decorator;

public class Azucar extends IngredientesBebida {
    public Azucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescriction() {
        return super.getDescriction() + " con azucar extra";
    }

    @Override
    public double precio() {
        return super.precio() + 0.10;
    }
}
