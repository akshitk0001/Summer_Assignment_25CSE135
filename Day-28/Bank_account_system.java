import java.util.*;

public class Bank_account_system {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int accountNumber = 0;
        String accountHolder = "";
        double balance = 0;

        boolean accountCreated = false;

        int choice;

        do {

            System.out.println("\n====== Bank Account System ======");
            System.out.println("1. Create Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    accountHolder = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    balance = sc.nextDouble();

                    accountCreated = true;

                    System.out.println("Account Created Successfully!");
                    break;

                case 2:

                    if(accountCreated) {

                        System.out.println("\nAccount Number : " + accountNumber);
                        System.out.println("Account Holder : " + accountHolder);
                        System.out.println("Current Balance: " + balance);

                    } else {

                        System.out.println("Please create an account first.");
                    }

                    break;

                case 3:

                    if(accountCreated) {

                        System.out.print("Enter Deposit Amount: ");
                        double deposit = sc.nextDouble();

                        balance += deposit;

                        System.out.println("Money Deposited Successfully!");
                        System.out.println("Updated Balance: " + balance);

                    } else {

                        System.out.println("Please create an account first.");
                    }

                    break;

                case 4:

                    if(accountCreated) {

                        System.out.print("Enter Withdraw Amount: ");
                        double withdraw = sc.nextDouble();

                        if(withdraw <= balance) {

                            balance -= withdraw;

                            System.out.println("Withdrawal Successful!");
                            System.out.println("Remaining Balance: " + balance);

                        } else {

                            System.out.println("Insufficient Balance!");
                        }

                    } else {

                        System.out.println("Please create an account first.");
                    }

                    break;

                case 5:

                    System.out.println("Thank You for Using Bank Account System.");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);
    }
}