package exo1;

import org.example.exo3.Year;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class YearTest {

    @Test
    void testLeapShouldBeTrueWhenY2024() {
        Year year = new Year();
        Assertions.assertTrue(year.isLeap(2024));
    }

    @Test
    void testLeapShouldBeTrueWhenY2000() {
        Year year = new Year();
        Assertions.assertTrue(year.isLeap(2000));
    }

    @Test
    void testLeapShouldBeTrueWhenY8000() {
        Year year = new Year();
        Assertions.assertTrue(year.isLeap(8000));
    }

    @Test
    void testLeapShouldBeFalseWhenY2021() {
        Year year = new Year();
        Assertions.assertFalse(year.isLeap(2021));
    }

    @Test
    void testLeapShouldBeFalseWhenY200() {
        Year year = new Year();
        Assertions.assertFalse(year.isLeap(200));
    }


}
