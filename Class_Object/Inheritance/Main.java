package Class_Object.Inheritance;

public class Main {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        AdvCalc ac1 = new AdvCalc();

        c1.add(5, 4);
        c1.sub(5, 4);
        ac1.multiply(5, 4);
        ac1.divide(5, 4);

    }

}
