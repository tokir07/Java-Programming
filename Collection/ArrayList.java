package Collection;

import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("NOVA");
        names.add("Alex");
        names.add("Sam");

        System.out.println("Names: " + names);

        names.set(1, "John");

        System.out.println("Updated: " + names);

        names.remove("Sam");

        System.out.println("Final: " + names);

        System.out.println("Size: " + names.size());
    }
}
