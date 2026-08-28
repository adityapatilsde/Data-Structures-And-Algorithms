package OOPSConcepts;


abstract class Bank {

    String bankName;
    String branch;

    Bank(String bankName, String branch) {
        this.bankName = bankName;
        this.branch = branch;
    }

    abstract void calculateInterest(double amount);

    abstract void accountType();

    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branch);
    }

    void welcome() {
        System.out.println("Welcome to " + bankName);
    }
}

class SBI extends Bank {

    SBI(String bankName, String branch) {
        super(bankName, branch);
    }

    void calculateInterest(double amount) {
        double interest = amount * 0.07;
        System.out.println("Interest Rate: 7%");
        System.out.println("Interest: " + interest);
    }

    void accountType() {
        System.out.println("Account Type: Savings Account");
    }
}

class HDFC extends Bank {

    HDFC(String bankName, String branch) {
        super(bankName, branch);
    }

    void calculateInterest(double amount) {
        double interest = amount * 0.06;
        System.out.println("Interest Rate: 6%");
        System.out.println("Interest: " + interest);
    }

    void accountType() {
        System.out.println("Account Type: Current Account");
    }
}

public class Banksystem {

    public static void main(String[] args) {

        SBI sbi = new SBI("State Bank of India", "Chennai");

        System.out.println("----- SBI -----");
        sbi.welcome();
        sbi.displayDetails();
        sbi.accountType();
        sbi.calculateInterest(50000);

        System.out.println();

        HDFC hdfc = new HDFC("HDFC Bank", "Bangalore");

        System.out.println("----- HDFC -----");
        hdfc.welcome();
        hdfc.displayDetails();
        hdfc.accountType();
        hdfc.calculateInterest(50000);
    }
}


