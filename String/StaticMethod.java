package String;

class Mobile {
    String Brand;
    int price;
    static String OS;

    public void show() {
        System.out.println("Brand : " + Brand);
        System.out.println("Price : " + price);
        System.out.println("OS : " + OS);
    }

    public static void show1(Mobile obj) {
        System.out.println("Brand : " + obj.Brand);
        System.out.println("Price : " + obj.price);
        System.out.println("OS : " + OS);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.Brand = "Samsung";
        m1.price = 20000;
        Mobile.OS = "Android";
        m1.show();

        Mobile m2 = new Mobile();
        m2.Brand = "Redmi";
        m2.price = 15000;
        Mobile.OS = "Android";
        m2.show();

        Mobile.OS = "iOS";
        System.out.println("After changing OS : ");
        m1.show();
        m2.show();

        System.out.println();

        Mobile.show1(m1);
        Mobile.show1(m2);
    }

}
