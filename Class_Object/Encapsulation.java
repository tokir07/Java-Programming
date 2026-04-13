package Class_Object;

class BankAccount {
    private String accountNumber;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void showBalance() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        account.showBalance();
    }
}
