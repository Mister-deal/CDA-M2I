package exo1;

import org.example.exception.StrikeException;
import org.example.exception.RollsException;
import org.example.exo4to6.Pins;
import org.example.exo4to6.Frame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FrameTest {
    @Mock
    private Pins pins;
    private Frame frame;

    @BeforeEach
    void setUp(){
        frame = new Frame(pins);
    }


    @Test
    void testMakeFirstThrowShouldIncreaseScore(){
        //frame = new Frame(pins);
        int score = frame.getScore();
        Mockito.when(pins.getFallenPins()).thenReturn(1);
        frame.makeThrow();
        Assertions.assertTrue(score < frame.getScore());
    }

    @Test
    void testMakeFirstThrowShouldNotIncreaseScore(){
        //frame = new Frame(pins);
        int score = frame.getScore();
        Mockito.when(pins.getFallenPins()).thenReturn(0);
        frame.makeThrow();
        Assertions.assertEquals(score, frame.getScore());
    }

    @Test
    void testMakeThrowShouldIncreaseScoreSecondTime(){
        int score = frame.getScore();
        Mockito.when(pins.getFallenPins()).thenReturn(1);
        frame.makeThrow();
        Assertions.assertTrue(score < frame.getScore());
    }

    @Test
    void testMakeThrowShouldNotIncreaseScoreSecondTime(){
        int score = frame.getScore();
        Mockito.when(pins.getFallenPins()).thenReturn(0);
        frame.makeThrow();
        Assertions.assertEquals(score, frame.getScore());
    }

    @Test
    void testMakeThrowShouldRaiseStrikeException() {
        Mockito.when(pins.getFallenPins()).thenReturn(10);
        frame.makeThrow();
        Assertions.assertThrowsExactly(StrikeException.class, () -> frame.makeThrow());
    }

    @Test
    void testMakeThrowShouldNotExceed2Throws(){
        Mockito.when(pins.getFallenPins()).thenReturn(0);
        frame.makeThrow();
        frame.makeThrow();
        Assertions.assertThrowsExactly(RollsException.class, () -> frame.makeThrow());
    }

    @Test
    void testMakeThrowAfterStrikeInLastFrameShouldNotRaiseStrikeException(){
        frame.counter = 9;
        frame = new Frame(pins);
        frame.makeThrow();
        Assertions.assertDoesNotThrow(() -> {
            Mockito.when(pins.getFallenPins()).thenReturn(10);
            frame.makeThrow();
        });
    }

    @Test
    void testMakeThrowAfterStrikeInLastFrameShouldIncreaseScore() {
        frame.counter = 9;
        frame = new Frame(pins);
        Mockito.when(pins.getFallenPins()).thenReturn(10);
        frame.makeThrow();
        Mockito.when(pins.getFallenPins()).thenReturn(5);
        frame.makeThrow();
        Assertions.assertEquals(15, frame.getScore());
    }

    @Test
    void testMakeThrowAfterStrikeInLastFrameShouldAllowMakeThrow(){
        frame.counter = 9;
        frame = new Frame(pins);
        Mockito.when(pins.getFallenPins()).thenReturn(10);
        frame.makeThrow();
        Mockito.when(pins.getFallenPins()).thenReturn(5);
        frame.makeThrow();
        Mockito.when(pins.getFallenPins()).thenReturn(5);
        Assertions.assertDoesNotThrow(() -> frame.makeThrow());
    }

    @Test
    void testMakeThrowAfterStrikeAndThrowInLastFrameShouldIncreaseScore() {
        frame.counter = 9;
        frame = new Frame(pins);
        Mockito.when(pins.getFallenPins()).thenReturn(10);
        frame.makeThrow();
        Mockito.when(pins.getFallenPins()).thenReturn(5);
        frame.makeThrow();
        Mockito.when(pins.getFallenPins()).thenReturn(5);
        frame.makeThrow();
        Assertions.assertEquals(20, frame.getScore());
    }
}
