package hw1.addAndSubtractOperation;

import hw1.abstractCalculator.AbstractCalculatorTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSubtract extends AbstractCalculatorTest {

    @DataProvider
    public Object[][] subtractDataSet() {
        return new Object[][]{
                {4.0, 9.0, -5.0},
                {7.0, 1.2, 5.8},
                {-2.0, -99.0, 97.0},
                {-3.4, -62.1, 58.7},
                {9.0, 9.0, 0.0}
        };
    }

    @Test(dataProvider = "subtractDataSet")
    public void testDataProviderSubtraction(double a, double b, double expected) {
        double actual = calculator.sub(a,b);
        assertEquals(actual, expected,0.00001);
    }
}
