package NOVA;

import java.util.Arrays;;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };
        int[] sortedArr = sortArray(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sortArray(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        return sortedArr;
    }
}
