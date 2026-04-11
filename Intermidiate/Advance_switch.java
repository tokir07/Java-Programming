package Intermidiate;

import java.util.Scanner;

public class Advance_switch {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check Even or Odd");
        System.out.println("2. Factorial");
        System.out.println("3. Reverse  a number");
        System.out.println("4. Exit");
        System.out.println("Enter the Choice: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Enter the number : ");
                int n = sc.nextInt();
                String ans = (n % 2 == 0) ? "Even" : "Odd";
                System.out.println("The number is : " + ans);
                break;
            case 2:
                System.out.println("Enter the number : ");
                int fact = 1;
                int n1 = sc.nextInt();
                for (int i = 1; i <= n1; i++) {
                    fact *= i;
                }
                System.out.println("Factorial of the number is : " + fact);
                break;
            case 3:
                System.out.println("Enter the number : ");
                int num1 = sc.nextInt();
                int rev = 0;
                while (num1 != 0) {
                    int rem = num1 % 10;
                    rev = rev * 10 + rem;
                    num1 = num1 / 10;
                }
                System.out.println("Reverse of the number is : " + rev);
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }

}
