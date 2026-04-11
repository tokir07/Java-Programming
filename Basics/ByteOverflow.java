package Basics;

public class ByteOverflow {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println("Initial value of byte b : " + b);
        b++;
        System.out.println("Value of byte b after overflow : " + b);
        b++;
        System.out.println("Value of byte b after another increment : " + b);
    }

}
