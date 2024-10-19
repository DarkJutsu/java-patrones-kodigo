package factory.ejercicio1.factoryClass;

import factory.ejercicio1._interface.Transporte;
import factory.ejercicio1._abstract.TransporteFactory;
import factory.ejercicio1.myClass.Carro;

public class CarroFactory extends TransporteFactory {
    @Override
    public Transporte setTransporte() {
        return new Carro();
    }
}
