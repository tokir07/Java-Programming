package Class_Object.Overloading;

class Area1 {
    void area(int side) {
        System.out.println("Area of Square is : " + (side * side));
    }

    void area(int length, int width) {
        System.out.println("Area of Rectangle is : " + (length * width));
    }

    void area(double radius) {
        System.out.println("Area of Circle is : " + (3.14 * radius * radius));
    }
}

public class Area {
    public static void main(String[] args) {
        Area1 a1 = new Area1();
        a1.area(5);
        a1.area(10, 5);
        a1.area(7.5);
    }
}
