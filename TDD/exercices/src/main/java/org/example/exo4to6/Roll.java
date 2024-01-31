package org.example.exo4to6;

public class Roll {
    private int score;
    private Pins fallenPins;
    private int fallenPinsNumber;

    public Roll(Pins fallenPins) {
        score = 0;
        this.fallenPins = fallenPins;
        fallenPinsNumber = fallenPins.getFallenPins();
    }

    public int getFallenPinsNumber() {
        return fallenPinsNumber;
    }

    public int getScore() {
        return fallenPinsNumber;
    }
}
