package factory.ejercicio1;

import factory.ejercicio1.factoryClass.BicicletaFactory;
import factory.ejercicio1.factoryClass.CarroFactory;
import factory.ejercicio1.factoryClass.MotoFactory;
import factory.ejercicio1._abstract.TransporteFactory;

public class Main {
    public static void main(String[] args) {
        TransporteFactory carFactory = new CarroFactory();
        TransporteFactory motoFactory = new MotoFactory();
        TransporteFactory biciFactory = new BicicletaFactory();

        carFactory.initTransporte();
        motoFactory.initTransporte();
        biciFactory.initTransporte();
    }
}