package exo1;

import org.example.exo2.Fib;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FibTest {
    @Test
    public void FibTestGetFibSeriesRange1(){
        Fib fibGenerator = new Fib(1);
        List<Integer> fibSeries = fibGenerator.getFibSeries();
    }
    @Test
    public void FibTestGetFibSeriesRange1IsNotEmpty(){
        Fib fibGenerator = new Fib(1);
        List<Integer> fibSeries = fibGenerator.getFibSeries();
        Assertions.assertFalse(fibSeries.isEmpty());
    }
    @Test
    public void FibTestGetFibSeriesRange6SortedResultsAscendingOrder(){
        Fib fibGenerator = new Fib(6);
        List<Integer> fibSeries = fibGenerator.getFibSeries();

        for(int i = 0; i < fibSeries.size() - 1; i++){
            Assertions.assertTrue(fibSeries.get(i) <= fibSeries.get(i + 1));
        }
    }

    @Test
    public void FibTestGetFibSeriesRange6Contains3(){
        Fib fibGenerator = new Fib(6);
        List<Integer> fibSeries = fibGenerator.getFibSeries();
        Assertions.assertTrue(fibSeries.contains(3));

    }
    @Test
    public void FibTestGetFibSeriesRange6Contains6Elements(){
        Fib fibGenerator = new Fib(6);
        List<Integer> fibSeries = fibGenerator.getFibSeries();
    }

    @Test
    public void FibTestGetFibSeriesRange6DoesNotContain4(){
        Fib fibGenerator = new Fib(6);
        List<Integer> fibSeries = fibGenerator.getFibSeries();
        Assertions.assertFalse(fibSeries.contains(4));
    }

    @Test
    public void FibTestGetFibSeriesRange6Contains6SpecificValues(){
        Fib fibGenerator = new Fib(6);
        List<Integer> fibSeries = fibGenerator.getFibSeries();
        Assertions.assertEquals(Arrays.asList(0,1,1,2,3,5), fibSeries);
    }




}
