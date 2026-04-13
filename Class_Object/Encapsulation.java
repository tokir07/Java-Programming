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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("123456789");
        account.setBalance(0);

        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }

}
