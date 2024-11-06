package decorator;

public class Leche extends IngredientesBebida {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescriction() {
        return super.getDescriction() + " con leche";
    }

    @Override
    public double precio() {
        return super.precio() + 0.50;
    }
}
