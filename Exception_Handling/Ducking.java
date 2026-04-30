package Exception_Handling;

class Tokir extends Exception {
    public Tokir(String s) {
        super(s);
    }
}

class A {
    public void show() {
        try {
            Class.forName(className = "ExceptionDemo");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found " + e);
        }
    }
}

public class Ducking {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }

}
