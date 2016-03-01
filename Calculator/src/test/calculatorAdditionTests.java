package test;

import calculator.calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by nayira on 25/02/16.
 */
public class calculatorAdditionTests {

    private calculator calc;
    private BigDecimal[] testData;

    @Before
    public void setup(){
        calc = new calculator();
        testData = new BigDecimal[]{
                new BigDecimal("1"),
                new BigDecimal("-2"),
                new BigDecimal("-3"),
                new BigDecimal("2.01"),
                new BigDecimal("2.03"),
                new BigDecimal("2"),
                new BigDecimal("-5"),
                new BigDecimal("4.04")
        };

    }
    @Test
    public void simple_add_test(){
        Assert.assertEquals(testData[5], calc.add(testData[0], testData[0]));
    }
    @Test
    public void simple_negative_add_test(){
        Assert.assertEquals(testData[6], calc.add(testData[1], testData[2]));
    }
    @Test
    public void simple_decimal_add_test() {
        Assert.assertEquals(testData[7], calc.add(testData[3], testData[4]));
    }
}
