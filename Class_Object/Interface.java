package Class_Object;

interface A {
    int age = 44;
    String name = "Rehan"; // by deafult variables are static and final in interface

    void show();

    void config();
}

class B implements A {
    public void show() {
        System.out.println("This is class B");
    }

    public void config() {
        System.out.println("Configuring class B");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
    }
}
