package Intermidiate;

public class Range {
    public static void main(String[] args) {
        int a = 990;
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println(a + " is divisible by 3 and 5");
        } else {
            System.out.println(a + " is not divisible by 3 and 5");
        }
        System.out.println("In Range 10-100: " + (a >= 1 && a <= 100));
    }
}
