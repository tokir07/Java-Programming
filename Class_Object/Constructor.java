package Class_Object;

class Student {
    String name;
    int age;
    int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;

        System.out.println("3 parameterized constructor : ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("ID : " + id);

    }

    public Student() {
        this.name = "Rehan";
        this.age = 20;
        this.id = 123;

        System.out.println("Default constructor : ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("ID : " + id);
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;

        System.out.println("2 parameterized constructor : ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
    }

}

public class Constructor {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Student s1 = new Student("Rehan", 20, 123);
        Student s2 = new Student();
        Student s3 = new Student("Rohit", 456);
    }

}
