package Class_Object.Overloading;

class FindMax {
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c) {
        return (a > c && a > b) ? a : (b > c) ? b : c;
    }
}

public class Max {
    public static void main(String[] args) {
        FindMax m1 = new FindMax();
        System.out.println("Maximum of 10 and 20 is : " + m1.max(10, 20));
        System.out.println("Maximum of 10, 20 and 15 is : " + m1.max(10, 20, 15));
    }

}
