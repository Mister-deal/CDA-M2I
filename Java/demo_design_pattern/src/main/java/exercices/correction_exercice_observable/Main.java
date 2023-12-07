package exercices.correction_exercice_observable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product = Product.builder().stockLevel(100)
                .observers(new ArrayList<>())
                .name("P1").build();
        Supplier supplier = new Supplier();
        StockManager stockManager = new StockManager();
        product.registerObserver(stockManager);
        product.registerObserver(supplier);

        product.changeStock(4);
        product.changeStock(6);
        product.changeStock(7);

        product.removeObserver(stockManager);

        product.changeStock(14);

    }
}
