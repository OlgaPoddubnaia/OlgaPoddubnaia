package hw1.multiplyAndDivideOperations;

import hw1.abstractCalculator.AbstractCalculatorTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDivide extends AbstractCalculatorTest {

    @Test
    public void testDivide() {
        double actual = calculator.div(77.0, 11.0);
        assertEquals(actual, 7.0, 0.00001);
    }
}
