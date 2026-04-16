package Class_Object;

@FunctionalInterface
interface A {
    void show();
}

// class B implements A {
// public void show() {
// System.out.println("In Show B");
// }
// }

public class FunctionalInterface {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In Anonymous show");
            }
        };
    }
}
