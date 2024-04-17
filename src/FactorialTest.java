import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

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
    @Test(enabled = false)
    public void testFactorial() {
        assertEquals(1, Main.factorial(-7));
    }
    @Test(expectedExceptions = StackOverflowError.class)
    public void testFactorialNegative() {
        Main.factorial(-5);
    }
}
