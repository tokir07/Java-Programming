package Class_Object;

enum Laptop {
    MacBook(2000), Dell(1500), HP, Lenovo(1800);

    @SuppressWarnings("unused")
    private int price;

    private Laptop() {
        this.price = 1000; // Default price if not specified
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumClass {
    public static void main(String[] args) {
        Laptop laptop = Laptop.MacBook;
        System.out.println("Laptop: " + laptop);
        System.out.println("Price: $" + laptop.getPrice());

        System.out.println("All Laptops:");
        for (Laptop l : Laptop.values()) {
            System.out.println(l + " - $" + l.getPrice());
        }
    }

}
