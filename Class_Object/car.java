package Class_Object;

class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is Running ");
    }
}

public class car {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Red";
        c1.speed = 100;
        System.out.println(c1.color + " " + c1.speed);
        c1.drive();

    }
}
