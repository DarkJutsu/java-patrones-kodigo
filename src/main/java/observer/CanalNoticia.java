package observer;

import java.util.ArrayList;
import java.util.List;

public class CanalNoticia implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificar(String noticia) {
        for (Observer observer : observers) observer.update(noticia);
    }

    @Override
    public void notificarExplicit(String noticia) {
        for (Observer observer : observers) observer.updateExplicit(noticia);
    }
}
