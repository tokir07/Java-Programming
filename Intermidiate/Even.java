package Intermidiate;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        String ans = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is : " + ans);
    }

}
