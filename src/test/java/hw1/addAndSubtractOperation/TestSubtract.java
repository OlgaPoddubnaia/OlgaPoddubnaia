package hw1.addAndSubtractOperation;

import hw1.abstractCalculator.AbstractCalculatorTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSubtract extends AbstractCalculatorTest {

    @Test
    public void testSubtraction() {
        double actual = calculator.sub(10, 6);
        assertEquals(actual, 4,0.00001);
    }
}
