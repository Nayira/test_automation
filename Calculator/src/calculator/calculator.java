package calculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by nayira on 25/02/16.
 */
public class calculator {
    public BigDecimal add(BigDecimal a, BigDecimal b) {
        return (a.add(b));
    }

    public int subtract(int a, int b) {
        return (a - b);
    }

    public int multiply(int a, int b) {
        return (a * b);
    }

    public int divide(int a, int b) {
        return (a / b);
    }
}