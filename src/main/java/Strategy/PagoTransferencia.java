package Strategy;

public class PagoTransferencia implements StrategyPago {
    @Override
    public void pagar(double pago) {
        System.out.println("Pago con Transferencia Bancaria($0.50 comision): $" + (pago + .50));
    }
}
