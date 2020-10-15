import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int expected = 15;
        int result = calculator.add(10, 5);
        assertEquals(expected, result);
        int expected2 = 150;
        int result2 = calculator.add(100, 50);
        assertEquals(expected2, result2);
    }

    @Test
    public void multiple() {
        Calculator calculator = new Calculator();
        double expected = 150;
        double result = calculator.multiple(10, 15);
        assertEquals(expected, result, 0.0001);
        double expected2 = 9;
        double result2 = calculator.multiple(3, 3);
        assertEquals(expected2, result2, 0.0001);
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        double expected = 8;
        double result = calculator.divide(16, 2);
        assertEquals(expected, result, 0.0001);
        double expected2 = 1;
        double result2 = calculator.divide(3, 3);
        assertEquals(expected2, result2, 0.0001);
    }

    @Test
    public void square() {
        Calculator calculator = new Calculator();
        double expected = 16;
        double result = calculator.square(4);
        assertEquals(expected, result, 0.0001);
        double expected2 = 4;
        double result2 = calculator.square(2);
        assertEquals(expected2, result2, 0.0001);
    }
}