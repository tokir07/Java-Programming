package Intermidiate;

public class Arithmatic {
    int a = 10;
    int b = 20;

    public void add() {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public void subtract() {
        int sub = a - b;
        System.out.println("Subtraction: " + sub);
    }

    public void multiply() {
        int mul = a * b;
        System.out.println("Multiplication: " + mul);
    }

    public void divide() {
        int div = a / b;
        System.out.println("Division: " + div);
    }

    public void modulus() {
        int mod = a % b;
        System.out.println("Modulus: " + mod);
    }

    public static void main(String[] args) {
        Arithmatic arithmatic = new Arithmatic();
        arithmatic.add();
        arithmatic.subtract();
        arithmatic.multiply();
        arithmatic.divide();
        arithmatic.modulus();
    }

}
