package exercices.correction_exercice_observable;

public class Supplier implements Observer<Integer> {
    @Override
    public void update(Integer stock) {
        System.out.println("The Supplier got the new product stock "+ stock);
    }
}
