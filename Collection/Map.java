package Collection;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<>();

        marks.put("NOVA", 90);
        marks.put("Alex", 85);
        marks.put("Sam", 78);

        System.out.println("Marks: " + marks);

        System.out.println("NOVA marks: " + marks.get("NOVA"));

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
