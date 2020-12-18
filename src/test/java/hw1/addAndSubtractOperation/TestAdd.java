package hw1.addAndSubtractOperation;

import hw1.abstractCalculator.AbstractCalculatorTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAdd extends AbstractCalculatorTest {

    @DataProvider
    public Object[][] addDataSet() {
        return new Object[][]{
                {4.0, 9.0, 13.0},
                {7.0, 1.2, 8.2},
                {-2.0, -99.0, -101.0},
                {-3.4, -62.1, -65.5},
                {-9.0, 9.0, 0.0}
        };
    }

    @Test(dataProvider = "addDataSet")
    public void testDataProviderAdd(double a, double b, double expected) {
        double actual = calculator.sum(a, b);
        assertEquals(actual, expected, 0.00001);
    }

}
