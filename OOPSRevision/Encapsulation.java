package OOPSRevision;
import java.util.Scanner;
public class Encapsulation {
    static public class BankManagementSystem {
        private String accHolderName;
        private long accNo;
        private double accBalance;

        void setAccHolderName(String accHolderName) {
            this.accHolderName = accHolderName;
        }

        String getAccHolderName() {
            return accHolderName;
        }

        void setAccNo(long accNo) {
            this.accNo = accNo;
        }

        long getAccNo() {
            return accNo;
        }

        void setAccBalance(double accBalance) {
            this.accBalance = accBalance;
        }

        double getAccBalance() {
            return accBalance;
        }

        void depositAmount(double amount) {
            if (amount > 0) {
                accBalance += amount;
            } else {
                System.out.println("Invalid amount entered");
            }
        }

        void withDrawalAmount(double amount) {
            if (amount > 0 && amount <= accBalance) {
                accBalance -= amount;
            } else {
                System.out.println("Insufficient account balance");
            }

        }

        void displayAccDetails() {
            System.out.println("Account holder name: " + accHolderName);
            System.out.println("Account Number: " + accNo);
            System.out.println("Account Balance: " + accBalance);
        }
        double displayBalance(){
            return accBalance;
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BankManagementSystem sb = new BankManagementSystem();

            System.out.println();
            System.out.println("****** Enter Customer details ******");
            System.out.println();

            System.out.print("Enter Account Holder Name: ");
            sb.setAccHolderName(sc.nextLine());

            System.out.print("Enter Account Number: ");
            sb.setAccNo(sc.nextLong());

            System.out.print("Enter Account balance: ");
            sb.setAccBalance(sc.nextDouble());

            System.out.println("******* Account details *******");
            System.out.println();
            sb.displayAccDetails();

            String arr[] = {"Withdrawal","Deposit"};
            System.out.println();
            System.out.println("Enter 0 for withdrawal");
            System.out.println("Enter 1 for deposit");
            System.out.println("Enter 2 to skip");
            System.out.println();
            System.out.print("SELECT CHOICE: ");
            int choice  = sc.nextInt();

            switch (choice){
                case 0:
                    System.out.print("Enter the amount to be withdrawal: ");
                    sb.withDrawalAmount(sc.nextDouble());
                    System.out.println("Updated account balance: "+sb.displayBalance());
                    System.out.println("Thank you please visit again!");

                    break;
                case 1:
                    System.out.println("Enter the amount to be deposited: ");
                    sb.depositAmount(sc.nextDouble());
                    System.out.println("Updated account balance: "+sb.displayBalance());
                    System.out.println("Thank you please visit again!");

                    break;
                default:
                    System.out.println("Thank you please visit again!");
                    break;
            }
        }
    }

