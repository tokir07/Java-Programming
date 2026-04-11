package Class_Object.Overloading;

class Test1 {
    void print(int a, double b) {
        System.out.println("int double");
    }

    void print(double a, int b) {
        System.out.println("double int");
    }

}

public class Test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Test1 t = new Test1();
        // t.print(10, 20);
    }
}
