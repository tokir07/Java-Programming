package Collection;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("NOVA");
        names.add("Alex");
        names.add("NOVA"); // duplicate

        System.out.println("Set: " + names);

        System.out.println("Contains Alex: " + names.contains("Alex"));

        names.remove("Alex");

        System.out.println("After removal: " + names);
    }
}
