import org.junit.Test;

import java.util.IllegalFormatException;
import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Cadet on 1/13/15 AD.
 */
public class RandomizerTest {
    @Test
    public void pattern1() {
        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(new MyRandomizer(1));
        assertEquals(1, randomizer.getPattern());
    }

    @Test
    public void pattern2() {
        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(new MyRandomizer(2));
        assertEquals(2, randomizer.getPattern());
    }

    @Test
    public void plusOperator() {
        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(new MyRandomizer(1));
        assertEquals(1, randomizer.getOperator());
    }


    @Test
    public void multiplyOperator() {
        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(new MyRandomizer(2));
        assertEquals(2, randomizer.getOperator());
    }


    @Test
    public void minusOperator() {
        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(new MyRandomizer(3));
        assertEquals(3, randomizer.getOperator());
    }

    @Test
    public void randomOperandIsOne() {
        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(new MyRandomizer(1));
        assertEquals(1, randomizer.getOperand());
    }

    @Test
    public void randomOperandIsNine() {
        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(new MyRandomizer(9));
        assertEquals(9, randomizer.getOperand());
    }

    @Test
    public void randomOperandIsNineWithMockito() {
        Random myRandom = mock(Random.class);
        when(myRandom.nextInt(anyInt())).thenReturn(8);

        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(myRandom);
        assertEquals(9, randomizer.getOperand());
    }


    private class MyRandomizer extends Random {
        int i;

        public MyRandomizer(int i) {
            this.i = i - 1;
        }

        public int nextInt(int max) {

            return i;
        }

    }
}
