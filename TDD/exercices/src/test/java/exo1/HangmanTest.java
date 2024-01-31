package exo1;

import org.example.exo4to6.Hangman;
import org.example.exo4to6.WordGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HangmanTest {
    @Mock
    private WordGenerator wordGenerator;
    private Hangman hangman;


    void testConvertWordToMask(){
        Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        hangman.makeMask();
        Assertions.assertEquals("______", hangman.getMask());
    }
}
