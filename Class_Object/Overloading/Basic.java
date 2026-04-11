package Class_Object.Overloading;

class Overloading {
    void add(int a, int b) {
        System.out.println("Sum of two integers is : " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three integers is : " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum of two doubles is : " + (a + b));
    }
}

public class Basic {
    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        o1.add(10, 20);
        o1.add(10, 20, 30);
        o1.add(10.5, 20.5);

    }

}
