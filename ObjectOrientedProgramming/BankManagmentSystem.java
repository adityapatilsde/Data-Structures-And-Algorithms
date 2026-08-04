package ObjectOrientedProgramming;
import java.util.Scanner;
public class BankManagmentSystem {
   static public class BankAccount {
        private long accNo;
        private String accHolderName;
        private double balance;

        void setAccountHolderName(String holderName){
            this.accHolderName = holderName;
        }
        String getAccountHolderName(){
            return accHolderName;
        }

        void setAccNo(long accno){
            this.accNo = accno;
        }
        long getAccNo(){
            return accNo;
        }


        void setAccBalance(double balance){
            if (balance > 0) {
                this.balance = balance;
            }
        }
        double getAccBalance(){
            return balance;
        }

        void depositAmount(double amount){
            if (amount > 0){
                balance += amount;
            }
            else {
                System.out.println("Invalid amount entry");
            }
        }

        void withdrawlAmount(double amount){
            if (amount <= 0){
                System.out.println("Invalid amount entry");
            }
           else  if (amount <= balance){
                balance -= amount;
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }

        void displayAccDetails(){
            System.out.println();
            System.out.println("Account holder name: "+accHolderName);
            System.out.println("Account No         : "+accNo);
            System.out.println("Account balance    : "+balance);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.println("Enter acc details: ");
        System.out.println();

        System.out.print("Enter acc holder name: ");
        acc.setAccountHolderName(sc.nextLine());

        System.out.print("Enter account number: ");
        acc.setAccNo(sc.nextLong());

        System.out.print("Enter account balance: ");
        acc.setAccBalance(sc.nextDouble());

        acc.displayAccDetails();

        acc.depositAmount(10000);
        System.out.println("Updated balance: "+acc.getAccBalance());
        acc.withdrawlAmount(200000);
        System.out.println("Updated balance: "+acc.getAccBalance());
        acc.withdrawlAmount(300000);
    }
}
