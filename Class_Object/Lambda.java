package Class_Object;

interface ex {
    void show(int i);
}

public class Lambda {
    public static void main(String[] args) {
        // ex obj = () -> {
        // System.out.println("In Lambda show ");
        // };

        ex obj1 = i -> System.out.println("Integer Show");

        // obj.show();
        obj1.show(5);
    }

}
