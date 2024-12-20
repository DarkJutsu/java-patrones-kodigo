package observer;

public interface Subject {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notificar(String noticia);

    void notificarExplicit(String noticia);
}
