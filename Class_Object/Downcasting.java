package Class_Object;

class A {
    public void show1() {
        System.out.println("This is class A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("This is class B");
    }
}

public class Downcasting {
    public static void main(String[] args) {
        A obj = (A) new B(); // Upcasting
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2(); // Downcasting
    }
}
