package ObjectOrientedProgramming;

class BankAccount {
    String name;
    int accountNo;
    double balance;

    BankAccount() {
        this("Unknown");
        System.out.println("Default constructor");
    }

    BankAccount(String name) {
        this(name, 1001);
        System.out.println("One-parameter constructor");
    }

    BankAccount(String name, int accountNo) {
        this(name, accountNo, 5000);
        System.out.println("Two-parameter constructor");
    }

    BankAccount(String name, int accountNo, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
        System.out.println("Three-parameter constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}

public class BankingChain {

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount();

        System.out.println();

        BankAccount a2 = new BankAccount("Aditya");

        System.out.println();

        BankAccount a3 = new BankAccount("Rahul", 2025, 15000);

        System.out.println();

        a1.display();

        System.out.println();

        a2.display();

        System.out.println();

        a3.display();
    }
}

