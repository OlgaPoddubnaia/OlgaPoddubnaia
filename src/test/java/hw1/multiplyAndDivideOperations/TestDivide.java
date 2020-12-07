package hw1.multiplyAndDivideOperations;

import hw1.abstractCalculator.AbstractCalculatorTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDivide extends AbstractCalculatorTest {

    @DataProvider
    public Object[][] divideDataSet() {
        return new Object[][]{
                {20.0, 5.0, 4.0},
                {30.3, 3.0, 10.1},
                {-10.0, -5.0, 2.0},
                {-3.0, 1.0, -3.0},
                {45.0, -9.0, -5.0}
        };
    }

    @Test(dataProvider = "divideDataSet")
    public void testDataProviderDivide(double a, double b, double expected) {
        double actual = calculator.div(a, b);
        assertEquals(actual, expected, 0.00001);
    }
}
