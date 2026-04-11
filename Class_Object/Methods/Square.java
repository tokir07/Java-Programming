package Class_Object.Methods;

class squ {
    int num;

    int calculateSquare() {
        return num * num;
    }
}

public class Square {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        squ s1 = new squ();
        s1.num = 5;
        System.out.println("Square of " + s1.num + " is: " + s1.calculateSquare());
    }

}
