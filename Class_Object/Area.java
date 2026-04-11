package Class_Object;

class details {
    int length;
    int width;

    void print() {
        System.out.println("Length is  :" + length);
        System.out.println("Width is :" + width);
        System.out.println("Area is :" + length * width);
    }
}

public class Area {
    @SuppressWarnings("resources")
    public static void main(String[] args) {
        details d1 = new details();
        d1.length = 10;
        d1.width = 5;
        d1.print();
    }

}
