package Class_Object.Methods;

class result {
    int num1;
    int num2;
    int num3;

    int findMax() {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}

public class Max {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        result r1 = new result();
        r1.num1 = 10;
        r1.num2 = 20;
        r1.num3 = 15;
        System.out.println("Maximum number is : " + r1.findMax());
    }

}
