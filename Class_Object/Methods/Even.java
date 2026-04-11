package Class_Object.Methods;

class check {
    int num;

    boolean isEven() {
        Boolean result = (num % 2 == 0) ? true : false;
        return result;
    }
}

public class Even {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        check c1 = new check();
        c1.num = 10;
        if (c1.isEven()) {
            System.out.println(c1.num + " is Even");
        } else {
            System.out.println(c1.num + " is Odd");
        }
    }

}
