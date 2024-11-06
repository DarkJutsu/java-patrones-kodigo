package observer;

public class Main {
    public static void main(String[] args) {
        CanalNoticia canal = new CanalNoticia();

        Observer user1 = new Usuario("Carlos", 20);
        Observer user2 = new Usuario("Sara", 17);
        Observer user3 = new Usuario("Elmer", 40);

        canal.addObserver(user1);
        canal.addObserver(user2);
        canal.addObserver(user3);

        canal.notificar("Tormentas fuertes en el pais.");
        canal.notificar("Suspencion de clases el dia lunes.");
        canal.notificarExplicit("Masacre de personas en Suiza.");
    }
}
