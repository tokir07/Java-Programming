package Intermidiate;

import java.util.Scanner;

public class Number_Properties {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        String ans = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is : " + ans);

        int count = 0;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            count++;
            sum += rem;
            num = num / 10;
        }
        System.out.println("The number of digits is : " + count);
        System.out.println("The sum of digits is : " + sum);
    }
}