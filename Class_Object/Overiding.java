package Class_Object;

class Calc {
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvCalc extends Calc {
    public int add(int a, int b) {
        return a + b + 1; // Override the add method
    }
}

public class Overiding {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Calc c = new Calc();
        AdvCalc ac = new AdvCalc();

        System.out.println(c.add(5, 10)); // Calls the add method of class Calc
        System.out.println(ac.add(5, 10)); // Calls the add method of class AdvCalc

    }
}
