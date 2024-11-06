package Strategy;

public class PagoPayPal implements StrategyPago {
    @Override
    public void pagar(double pago) {
        System.out.println("Pago con PayPal: $" + pago);
    }
}
