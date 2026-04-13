package Array;

import java.util.Scanner;
import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Reversing the array.........");
        for (int i = 0; i < n / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(n - 1 - i));
            list.set(n - 1 - i, temp);
        }
        System.out.println("Reversed array : " + list);
        sc.close();
    }

}
