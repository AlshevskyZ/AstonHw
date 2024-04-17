import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FactorialTest {
    @Test
    public void testFactorialZero() {
        assertEquals(1, Main.factorial(0));
    }
    @Test
    public void testFactorialOne() {
        assertEquals(1, Main.factorial(1));
    }
    @Test
    public void testFactorialFive() {
        assertEquals(120, Main.factorial(5));
    }
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 5, 10}) // Значения для параметризации
    public void testFactorialValues(int n) {
        long expected = 1;
        for (int i = 1; i <= n; i++) {
            expected *= i;
        }
        assertEquals(expected, Main.factorial(n));
    }
    @RepeatedTest(5)
    public void testFactorialRandom() {
        Random rnd = new Random();
        int n = rnd.nextInt(10);
        long expected = 1;
        for (int i = 1; i <= n; i++) {
            expected *= i;
        }
        assertEquals(expected, Main.factorial(n));
    }
}
