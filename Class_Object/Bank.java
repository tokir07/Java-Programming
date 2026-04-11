package Class_Object;

class entry {
    String name;
    int amount;

    void deposit(int amount) {
        this.amount = this.amount + amount;
        System.out.println("Amount Deposited : " + amount);
    }

    void withdraw(int amount) {
        if (this.amount >= amount) {
            this.amount = this.amount - amount;
            System.out.println("Amount Withdrawn : " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        entry entry = new entry();
        entry.name = "Rohit";
        entry.amount = 1000;
        entry.deposit(500);
        entry.withdraw(200);
        System.out.println("Final Balance : " + entry.amount);
    }

}
