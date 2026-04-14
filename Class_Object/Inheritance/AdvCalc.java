package Class_Object.Inheritance;

public class AdvCalc {

    public void multiply(int a, int b) {
        System.out.println("Product : " + (a * b));
    }

    public void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Quotient : " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {

    }

}
