package Class_Object;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        // Step 1: Input as String (simulate user input)
        String m1 = "85";
        String m2 = "90";
        String m3 = "78";

        // Step 2: Convert String to int using wrapper
        int marks1 = Integer.parseInt(m1);
        int marks2 = Integer.parseInt(m2);
        int marks3 = Integer.parseInt(m3);

        // Step 3: Store in ArrayList (autoboxing)
        ArrayList<Integer> marksList = new ArrayList<>();
        marksList.add(marks1);
        marksList.add(marks2);
        marksList.add(marks3);

        // Step 4: Calculate total
        int total = 0;
        for (Integer mark : marksList) {
            total += mark; // auto-unboxing
        }

        // Step 5: Calculate average
        double average = (double) total / marksList.size();

        // Step 6: Convert result to String
        String result = Double.toString(average);

        // Output
        System.out.println("Marks List: " + marksList);
        System.out.println("Total: " + total);
        System.out.println("Average: " + result);
    }
}
