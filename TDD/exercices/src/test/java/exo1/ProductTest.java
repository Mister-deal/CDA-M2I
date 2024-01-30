package exo1;

import org.example.exception.QualityException;
import org.example.exo4to6.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ProductTest {

    private Product shop;

    @BeforeEach
    void setUp() {
            shop = new Product();
    }
    @Test
    void testQualityDecreases() throws QualityException {
        shop = new Product();
        shop.setQuality(1);
        shop.setSellIn(0);
        shop.update();
        Assertions.assertEquals(0, shop.getQuality());
    }

    @Test
    void testSellInDecreases() throws QualityException {
        shop = new Product();
        shop.setQuality(1);
        shop.setSellIn(0);
        shop.update();
        Assertions.assertEquals(0, shop.getSellIn());
    }
    void testQualityArticleShouldNeverGoBecomeNegative(){

    }
    void testQualityArticleShouldNeverExceed50(){

    }
    void testQualityBrieIncreasesWhenHeGrowsOlder(){

    }

    void testQualityMilkDecaysTwoTimesFasterThanOtherProducts(){

    }
}
