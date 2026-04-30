package Exception_Handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;

        try {
            System.out.println(j / i);
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("At the End ");
    }

}
