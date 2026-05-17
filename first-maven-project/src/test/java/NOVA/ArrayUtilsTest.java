package NOVA;

import org.junit.Test;

public class ArrayUtilsTest {

    // @Test
    // public void testSortArray() {
    // ArrayUtils arrayUtils = new ArrayUtils();
    // int[] arr = { 5, 2, 8, 1, 3 };
    // int[] sortedArr = arrayUtils.sortArray(arr);
    // int[] expectedArr = { 1, 2, 3, 5, 8 };
    // assert java.util.Arrays.equals(sortedArr, expectedArr) : "The array was not
    // sorted correctly.";

    // }

    @Test(expected = NullPointerException.class)
    public void testSortArray() {
        int input[] = null;
        ArrayUtils.sortArray(input);
    }

    @Test(timeout = 10)
    public void test() {
        int input[] = { 5, 2, 8, 1, 3 };
        ArrayUtils.sortArray(input);
    }
}
