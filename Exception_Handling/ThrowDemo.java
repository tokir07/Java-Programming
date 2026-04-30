package Exception_Handling;

public class ThrowDemo {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException("I don't want to print Zero......");
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero...");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }

}
