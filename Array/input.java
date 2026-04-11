package Array;

import java.util.Scanner;
import java.util.ArrayList;

public class input {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("The elements of the array are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
