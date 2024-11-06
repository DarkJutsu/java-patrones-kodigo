package decorator;

public class Cafe implements Bebida {
    @Override
    public double precio() {
        return 1;
    }

    @Override
    public String getDescriction() {
        return "Cafe";
    }
}
