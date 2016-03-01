package test;

import calculator.calculator;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

/**
 * Created by nayira on 25/02/16.
 */
public class calculatorTest {

    private calculator calc;

    @Before
    public void setup(){
        calc = new calculator();
    }
    @Test
    public void simple_subtract_test(){
        Assert.assertEquals(calc.subtract(2, 1), 1);
    }
    @Test
    public void simple_multiply_test(){
        Assert.assertEquals(calc.multiply(2, 2), 4);
    }
    @Test
    public void simple_divide_test(){
        Assert.assertEquals(calc.divide(10, 5), 2);
    }
}