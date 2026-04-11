package Array;

import java.util.Scanner;
import java.util.ArrayList;

public class Largest {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        int max = list.get(0);
        for (int i = 1; i < size; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("The largest element in the array is : " + max);
        sc.close();
    }

}
