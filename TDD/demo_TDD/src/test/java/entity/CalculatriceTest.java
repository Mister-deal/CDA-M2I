package entity;


import org.example.entity.Calculatrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {

    @Test
    void testAddiction() {
        //arrange
        Calculatrice calculatrice = new Calculatrice();

        //act
        double result = calculatrice.addition(10, 45);

        //assert
        Assertions.assertEquals(55, result);
    }

    @Test
    void testSoustraction() {
        //arrange
        Calculatrice calculatrice = new Calculatrice();

        //act
        double result = calculatrice.soustraction(55, 10);

        //assert
        Assertions.assertEquals(45, result);
    }
    @Test
    void testDivision() {
        //arrange
        Calculatrice calculatrice = new Calculatrice();

        //act and assert

        Assertions.assertThrowsExactly( RuntimeException.class, () ->{
            //act
            calculatrice.division(10,0);
        });
    }
}
