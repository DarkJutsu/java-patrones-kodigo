package Strategy;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        carrito.setStrategyPago(new PagoPayPal());
        carrito.proccessPago(247.99);

        carrito.setStrategyPago(new PagoTransferencia());
        carrito.proccessPago(188);

        carrito.setStrategyPago(new PagoTarjetaCredito());
        carrito.proccessPago(582.55);
    }
}
