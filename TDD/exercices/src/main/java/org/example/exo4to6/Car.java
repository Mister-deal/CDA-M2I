package org.example.exo4to6;

import org.example.exception.ConditionException;

public class Car {

    public int condition;

    public int rentDueIn;

    public String type;

    public Car(int condition, int rentDueIn, String type) {
        this.condition = condition;
        this.rentDueIn = rentDueIn;
        this.type = type;
    }

    public Car(int condition, int rentDueIn) {
        this.condition = condition;
        this.rentDueIn = rentDueIn;
    }

    public int getCondition() {

        return condition;
    }

    public int getRentDueIn() {

        return rentDueIn;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setRentDueIn(int rentDueIn) {
        this.rentDueIn = rentDueIn;
    }

    public void update() {
        if(condition > 100 || condition < 0){
            throw new ConditionException();
        }

        if(condition > 0) {
            if(rentDueIn > 0){
                setRentDueIn(rentDueIn - 1);
            }
            setCondition(condition - 1);
        } else if(rentDueIn == 0){
            setCondition(condition - 2);
        }
    }
    public void updateType(){
        if(condition > 100 || condition < 0){
            throw new ConditionException();
        }
        if(condition > 0 && type.equals("Luxury")){
            if (rentDueIn > 0){
                setRentDueIn(rentDueIn - 1);
            }
            setCondition(condition + 2);
        } else if (condition > 0 && type.equals("Old")) {
            if (rentDueIn > 0){
                setRentDueIn(rentDueIn - 1);
            }
            setCondition(condition - 2);
        }
    }

    public void setType(String type) {
        this.type = type;
    }
}
