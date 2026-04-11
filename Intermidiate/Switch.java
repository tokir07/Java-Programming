package Intermidiate;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the number : ");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the operator : ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("The sum is : " + (num1 + num2));
                break;
            case '-':
                System.out.println("The difference is : " + (num1 - num2));
                break;
            case '*':
                System.out.println("The product is : " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("The quotient is : " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println("The remainder is : " + (num1 % num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");

        }
    }
}
