package Strategy;

public class Carrito {
    private StrategyPago strategyPago;

    public void setStrategyPago(StrategyPago strategyPago) {
        this.strategyPago = strategyPago;
    }

    public void proccessPago(double monto) {
        if (strategyPago == null) {
            System.out.println("Seleccione un metodo de pago");
        } else {
            strategyPago.pagar(monto);
        }
    }
}
