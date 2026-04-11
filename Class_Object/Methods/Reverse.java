package Class_Object.Methods;

class rev {
    int num;

    int revrseNum() {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }
}

public class Reverse {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        rev r1 = new rev();
        r1.num = 12345;
        System.out.println("Reverse of " + r1.num + " is: " + r1.revrseNum());
    }

}
