package factory.ejercicio1._abstract;

import factory.ejercicio1._interface.Transporte;

public abstract class TransporteFactory {
    public abstract Transporte setTransporte();

    public void initTransporte() {
        Transporte trans = setTransporte();
        trans.mover();
    }
}
