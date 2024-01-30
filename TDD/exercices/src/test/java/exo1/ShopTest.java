package exo1;

import org.example.exception.QualityException;
import org.example.exo4to6.Product;
import org.example.exo4to6.Shop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShopTest {
    private Shop shop;
    private Product product;

    @BeforeEach
    void setUp() {
        shop = new Shop();

    }

    @Test
    void testUpdateShouldDecreaseQuality() {
        int quality = 1;
        int sellIn = 1;
        product = Product.builder().name("p1").type("t1").quality(quality).sellIn(sellIn).build();
        shop.update(product);
        Assertions.assertEquals(0, product.getQuality());
    }

    @Test
    void testUpdateShouldDecreaseSellIn() {
        int quality = 1;
        int sellIn = 1;
        product = Product.builder().name("p1").type("t1").quality(quality).sellIn(sellIn).build();
        shop.update(product);
        Assertions.assertEquals(0, product.getSellIn());
    }

    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenSellInIs0() {
        int quality = 10;
        int sellIn = 0;
        product = Product.builder().name("p1").type("t1").quality(quality).sellIn(sellIn).build();
        shop.update(product);
        Assertions.assertEquals(8, product.getQuality());
    }

    @Test
    void testUpdateShouldRaiseQualityExceptionWhenQualityIsNegative() {
        int quality = -10;
        int sellIn = 0;
        product = Product.builder().name("p1").type("t1").quality(quality).sellIn(sellIn).build();

        Assertions.assertThrowsExactly(QualityException.class, () -> {
            shop.update(product);
        });
    }

    @Test
    void testUpdateShouldRaiseQualityExceptionWhenQualityIsMoreThan50() {
        int quality = 51;
        int sellIn = 0;
        product = Product.builder().name("p1").type("t1").quality(quality).sellIn(sellIn).build();

        Assertions.assertThrowsExactly(QualityException.class, () -> {
            shop.update(product);
        });
    }

    @Test
    void testUpdateShouldIncreaseQualityWhenProductIsBrie() {
        product = Product.builder().quality(10).sellIn(10).name("brie vielli").type("laitier").build();

        shop.update(product);
        Assertions.assertEquals(11, product.getQuality());
    }

    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenProductTypeIsDairy() {
        product = Product.builder().quality(10).sellIn(10).name("p1").type("laitier").build();
        shop.update(product);
        Assertions.assertEquals(8, product.getQuality());
    }
    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenProductTypeIsDairyAndSellInIs0() {
        product = Product.builder().quality(10).sellIn(0).name("p1").type("laitier").build();
        shop.update(product);
        Assertions.assertEquals(6, product.getQuality());
    }
}
