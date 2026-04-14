package Class_Object;

class A {
    public A() {
        System.out.println("Constructor of class A");
    }

    public A(int x) {
        System.out.println("Constructor of class A with parameter: " + x);
    }
}

class B extends A {
    public B() {
        super(); // Calls the default constructor of class A
        System.out.println("Constructor of class B");
    }

    public B(int x) {
        this();
        // super(x); // Calls the parameterized constructor of class A
        System.out.println("Constructor of class B with parameter: " + x);
    }
}

public class This {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B(5);
    }
}
