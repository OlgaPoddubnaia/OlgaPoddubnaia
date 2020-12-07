package hw1.multiplyAndDivideOperations;

import hw1.abstractCalculator.AbstractCalculatorTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMultiply extends AbstractCalculatorTest {

    @Test
    public void testMultiply() {
        double actual = calculator.mult(11.0, 7.0);
        assertEquals(actual, 77.0, 0.00001);
    }
}
