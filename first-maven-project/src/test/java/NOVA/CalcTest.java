package NOVA;

import org.junit.Test;

public class CalcTest {
    @Test(expected = ArithmeticException.class)
    public void testCalc() {
        Calc calc = new Calc();
        calc.divide(10, 0);
    }

}
