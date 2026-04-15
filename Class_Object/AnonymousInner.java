package Class_Object;

class A {
    public void show() {
        System.out.println("This is class A");
    }
}

public class AnonymousInner {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("This is an anonymous inner class");
            }
        };

        obj.show();
    }
}
