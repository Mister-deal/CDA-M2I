package exo1;

import org.example.exception.ConditionException;
import org.example.exo4to6.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    private Car car;

    @Test
    void testUpdateShouldDecreaseCondition() {
        car = new Car(5, 70);
        car.update();
        Assertions.assertEquals(4, car.getCondition());
    }


    @Test
    void testUpdateShouldDecreaseRentDueIn() {
        car = new Car(5, 70);
        car.update();
        Assertions.assertEquals(69, car.getRentDueIn());
    }
    @Test
    void testUpdateConditionShouldNotBe100(){
        car = new Car(101, 50);
        Assertions.assertThrows(ConditionException.class, car::update);
    }

    @Test
    void testUpdateConditionShouldNotBeBelow0(){
        car = new Car(-1, 20);
        Assertions.assertThrows(ConditionException.class, car::update);
    }

    @Test
    void testUpdateConditionLuxuryIncreasesWithTime(){
        car = new Car(30, 24);
        car.setType("Luxury");
        car.updateType();
        Assertions.assertEquals(32, car.getCondition());
    }

    @Test
    void testUpdateConditionOldDecreasesTwoTimeMoreRapidly(){
        car = new Car(30, 24);
        car.setType("Old");
        car.updateType();
        Assertions.assertEquals(28, car.getCondition());
    }

}
