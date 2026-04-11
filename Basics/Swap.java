package Basics;

public class Swap {
    public static void main(String[] args) {
        // Swapping two numbers using third variable
        int a = 5;
        int b = 10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping, a = " + a);
        System.out.println("After swapping, b = " + b);

        // Swapping two numbers without using third variable
        int x = 15;
        int y = 20;
        x = x + y; // x now becomes 35
        y = x - y; // y becomes 15
        x = x - y; // x becomes 20
        System.out.println("After swapping, x = " + x);
        System.out.println("After swapping, y = " + y);

    }

}
