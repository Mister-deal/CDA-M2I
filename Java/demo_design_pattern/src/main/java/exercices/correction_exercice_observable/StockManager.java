package exercices.correction_exercice_observable;

public class StockManager implements Observer<Integer> {
    @Override
    public void update(Integer element) {
        System.out.println("Stock manger has the new stock "+ element);
    }
}
