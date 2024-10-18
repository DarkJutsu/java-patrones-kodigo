package semana4.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Config config1 = Config.getInstancia();
        Config config2 = Config.getInstancia();

        System.out.println("Configuracion inicial.");
        System.out.println("Configuracion general " + config1.getConfigGeneral());
        System.out.println("Tiempo de espera: " + config1.getTime());

        config1.setConfigGeneral("Configuracion personalizada");
        config1.setTime(35);

        System.out.println("\nConfiguracion Personalizada.");
        System.out.println("Configuracion general " + config1.getConfigGeneral());
        System.out.println("Tiempo de espera: " + config1.getTime());

        System.out.println("\nConfiguracion Personalizada. Config 2");
        System.out.println("Configuracion general " + config2.getConfigGeneral());
        System.out.println("Tiempo de espera: " + config2.getTime());

        if (config1 == config2) {
            System.out.println("\nLas instancias son iguales");
        } else {
            System.out.println("\nLas instancias no son iguales");
        }

    }
}
