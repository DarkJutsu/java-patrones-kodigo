package factory.ejercicio1.factoryClass;

import factory.ejercicio1._abstract.TransporteFactory;
import factory.ejercicio1.myClass.Bicicleta;
import factory.ejercicio1._interface.Transporte;

public class BicicletaFactory extends TransporteFactory {
    @Override
    public Transporte setTransporte() {
        return new Bicicleta();
    }
}
