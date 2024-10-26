package decorator.ejercicio1;

import decorator.ejercicio1._class.Azucar;
import decorator.ejercicio1._class.Cafe;
import decorator.ejercicio1._class.Leche;
import decorator.ejercicio1._interface.Bebida;

public class Main {
    public static void main(String[] args) {
        Bebida cafe=new Cafe();

        System.out.println(cafe.getDescription() + ", precio $" + cafe.getPrecio());

        cafe=new Leche(cafe);
        System.out.println(cafe.getDescription() + ", precio $" + cafe.getPrecio());

        cafe=new Azucar(cafe);
        System.out.println(cafe.getDescription() + ", precio $" + cafe.getPrecio());
    }
}
