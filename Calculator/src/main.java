import calculator.calculator;

import java.math.BigDecimal;

/**
 * Created by nayira on 25/02/16.
 */
public class main {

    public static void main(String[] args)
    {
        calculator calc = new calculator();

        BigDecimal firstNumber = new BigDecimal(1);
        BigDecimal secondNumber = new BigDecimal(1);
        BigDecimal oneplusone = calc.add(firstNumber, secondNumber);
        int threeminusone = calc.subtract(3, 1);
        System.out.println(oneplusone);
        System.out.println(threeminusone);

    }

}
