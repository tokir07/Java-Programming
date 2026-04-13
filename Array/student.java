package Array;

public class student {
    int rollno;
    String name;
    float marks;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        student s1 = new student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 85.5f;

        student s2 = new student();
        s2.rollno = 2;
        s2.name = "Jane";
        s2.marks = 90.0f;

        student s3 = new student();
        s3.rollno = 3;
        s3.name = "Rehan";
        s3.marks = 88.0f;

        student student[] = { s1, s2, s3 };
        for (int i = 0; i < student.length; i++) {
            System.out.println("Roll No : " + student[i].rollno);
            System.out.println("Name : " + student[i].name);
            System.out.println("Marks : " + student[i].marks);
            System.out.println();
        }
    }
}
