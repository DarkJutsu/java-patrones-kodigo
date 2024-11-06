package decorator;

public class Main {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        System.out.println(cafe.getDescriction() + ", precio: $" + cafe.precio());

        cafe = new Azucar(cafe);
        System.out.println(cafe.getDescriction() + ", precio: $" + cafe.precio());

        cafe = new Leche(cafe);
        System.out.println(cafe.getDescriction() + ", precio: $" + cafe.precio());
    }
}
