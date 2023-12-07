package exercices.correction_exercice_observable;

public interface Subject<U> {
    void registerObserver(Observer<U> observer);
    void removeObserver(Observer<U> observer);

    void notifyObservers(U element);
}
