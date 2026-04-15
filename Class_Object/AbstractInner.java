package Class_Object;

abstract class A {
    public abstract void show();
}

class B extends A {
    public void show() {
        System.out.println("This is class B");
    }
}

public class AbstractInner {
    public static void main(String[] args) {
        A obj = new B(); // obj is of type A but refers to an instance of B
        obj.show();

        A obj1 = new A() {
            public void show() {
                System.out.println("This is an anonymous inner class");
            }
        };
        obj1.show();
    }
}
