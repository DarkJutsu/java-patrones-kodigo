package factory.ejercicio1.myClass;

import factory.ejercicio1._interface.Transporte;

public class Moto implements Transporte {
    @Override
    public void mover() {
        System.out.println("Se mueven las 2 ruedas");
    }
}