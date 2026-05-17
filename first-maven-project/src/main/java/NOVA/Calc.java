package NOVA;

public class Calc {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return a / b;
    }
}
