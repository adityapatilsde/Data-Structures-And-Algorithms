package RandomCodesPracticeFile;

import java.util.Scanner;
public class practice {
       static public class BankAccount{
           String AccHolderName;
           double Accno;
           private double balance;

           void setBalance(double amount){
               this.balance = amount;
           }
           double getBalance(){
               return balance;
           }
           void depositAmount(int amount){
               if (amount > 0){
                   balance += amount;
                   System.out.println("Amount deposited successfully");
               }
               else{
                   System.out.println("Invalid amount");
               }
           }
           void withdrawAmount(int amount){
               if (amount < balance && amount >0){
                   balance -= amount;
                   System.out.println("Amount withdrawn succesfully");
               }
               else {
                   System.out.println("Insufficient amount");
               }
           }

           public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

               System.out.print("Enter acc balanace: ");
               double balance = sc.nextDouble();

               BankAccount b = new BankAccount();
               b.setBalance(balance);
               b.depositAmount(2000);
               b.withdrawAmount(500);
               System.out.println("Balance amount: "+b.getBalance());
           }
       }
    }





