package Class_Object;

class details {
    String name;
    float marks;

    void print() {
        System.out.println("Name is  :" + name);
        System.out.println("Marks are :" + marks);
    }
}

public class Student {
    @SuppressWarnings("resources")
    public static void main(String[] args) {
        details d1 = new details();
        d1.name = "Rohit";
        d1.marks = 90.5f;
        d1.print();
    }
}
