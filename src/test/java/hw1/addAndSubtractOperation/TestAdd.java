package hw1.addAndSubtractOperation;

import hw1.abstractCalculator.AbstractCalculatorTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAdd extends AbstractCalculatorTest {

    @Test
    public void testAdd() {
        double actual = calculator.sum(3.0, 5.0);
        assertEquals(actual, 8.0, 0.00001);
    }

}
