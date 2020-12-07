package hw1.multiplyAndDivideOperations;

import hw1.abstractCalculator.AbstractCalculatorTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMultiply extends AbstractCalculatorTest {

    @DataProvider
    public Object[][] multiplyDataSet() {
        return new Object[][]{
                {20.0, 3.0, 60.0},
                {-10.0, -5.0, 50.0},
                {-3.0, 1.0, -3.0},
                {45.0, 0.0, 0.0}
        };
    }

    @Test(dataProvider = "multiplyDataSet")
    public void testDataProviderMultiply(double a, double b, double expected) {
        double actual = calculator.mult(a,b);
        assertEquals(actual, expected, 0.00001);
    }
}
