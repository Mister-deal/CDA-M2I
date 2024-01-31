package org.example.exo4to6;

import org.example.exception.StrikeException;
import org.example.exception.RollsException;

import java.util.ArrayList;
import java.util.List;

public class Frame {
    public static int counter = 0;
    private int frameNumber;
    private Pins fallenPins;
    private int remainingPins;
    private int score;
    private List<Roll> rolls;

    {
        counter++;
    }

    public Frame(Pins fallenPins) {
        this.fallenPins = fallenPins;
        remainingPins = 10;
        score = 0;
        rolls = new ArrayList<>();
        frameNumber = counter;
    }

    public int getScore() {
        return score;
    }

    public void makeThrow() {
        if (rolls.isEmpty()) {
            rolls.add(new Roll(this.fallenPins));
            remainingPins -= rolls.get(0).getFallenPinsNumber();
            score += rolls.get(0).getScore();
        } else if (rolls.size() == 1 && remainingPins > 0) {
            rolls.add(new Roll(this.fallenPins));
            remainingPins -= rolls.get(1).getFallenPinsNumber();
            score += rolls.get(1).getScore();
        } else if (frameNumber == 10 && remainingPins == 0 && rolls.size() == 1) {
            remainingPins = 10;
            rolls.add(new Roll(this.fallenPins));
            remainingPins -= rolls.get(1).getFallenPinsNumber();
            score += rolls.get(1).getScore();
        } else if (frameNumber == 10 && rolls.size() == 2 && rolls.get(0).getFallenPinsNumber() == 10) {
            if (remainingPins == 0){
                remainingPins = 10;
            }
            rolls.add(new Roll(this.fallenPins));
            remainingPins -= rolls.get(2).getFallenPinsNumber();
            score += rolls.get(2).getScore();
        } else if (rolls.size() == 2) {
            throw new RollsException();
        } else {
            throw new StrikeException();
        }
    }
}
