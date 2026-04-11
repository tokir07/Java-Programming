package Intermidiate;

import java.util.Scanner;

public class Armstrong {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }
        sc.close();
    }

}
