package Class_Object;

sealed class Shape permits Circle, Rectangle {
    abstract void draw();
}

final class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

non-sealed class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Sealed {
    public static void main(String[] args) {

    }
}
