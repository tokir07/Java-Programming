package Class_Object;

class A {
    int age;

    public void show() {
        System.out.println("This is class A");
    }

    class B {
        public void showB() {
            System.out.println("This is class B");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        A.B b = a.new B();
        b.showB();
    }
}
