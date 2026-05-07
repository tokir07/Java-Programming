package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
}

public class Comparable {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(90));
        list.add(new Student(70));
        list.add(new Student(80));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.marks);
        }
    }
}
