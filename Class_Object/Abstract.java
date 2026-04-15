package Class_Object;

abstract class car {
    public abstract void drive();

    public void music() {
        System.out.println("Car is playing music");
    }

}

class Audi extends car {
    public void drive() {
        System.out.println("Audi is driving");
    }
}

public class Abstract {
    public static void main(String[] args) {
        car audi = new Audi();
        audi.drive();
        audi.music();
    }
}
