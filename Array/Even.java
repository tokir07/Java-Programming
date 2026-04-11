package Array;

import java.util.Scanner;
import java.util.ArrayList;

public class Even {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Removing Even numbers from the array.........");
        for (int i = 0; i < size; i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
                size--;
            }
        }
        System.out.println("Array after removing even numbers : " + list);
        sc.close();
    }

}
