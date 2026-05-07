package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

public class Comparator {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(90));
        list.add(new Student(70));
        list.add(new Student(80));

        Comparator<Student> comp = (a, b) -> a.marks - b.marks;

        Collections.sort(list, comp);

        for (Student s : list) {
            System.out.println(s.marks);
        }
    }
}
