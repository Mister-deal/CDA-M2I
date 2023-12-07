package exercices.correction_exercice_observable;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Product implements Subject<Integer> {

    private String name;
    private Integer stockLevel;
    private List<Observer<Integer>> observers;



    @Override
    public void registerObserver(Observer<Integer> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<Integer> observer) {
        observers.remove(observer);
    }

    public void changeStock(int qty) {
        setStockLevel(getStockLevel() - qty);
        notifyObservers(getStockLevel());
    }

    @Override
    public void notifyObservers(Integer element) {
        observers.forEach(o -> {
            o.update(stockLevel);
        });
    }
}
