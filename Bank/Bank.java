package Bank;
import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
    public static void main (String[] args) {

        // Welcome the user
        System.out.println("Welcome to the Bank-O-Matic 2000");

        // Create an ArrayList to hold the accounts
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Create a variable to manage the choice of the user.
        int choice;

        // WHILE LOOP to iterate until the user chooses "9. Quit" (which will invoke 'return')
        while (true) {

            // Display the menu and load 'choice' with input from user
            displayMenu();
            System.out.print("Your choice: ");
            choice = scanner.nextInt(); // Don't worry about erroneous data
            System.out.println();

            // Handle the 'choice' with a switch statement
            // Call methods (passing in the ArrayList 'accounts')
            switch (choice) {
                case 1: addAccount(accounts, scanner);
                    break;
                case 2: checkStatus(accounts, scanner);
                    break;
                case 3: changeAccountHolderName(accounts, scanner);
                    break;
                case 4: deposit(accounts, scanner);
                    break;
                case 5: withdraw(accounts, scanner);
                    break;
                case 6: getInterestRate();
                    break;
                case 7: setInterestRate(scanner);
                    break;
                case 8: applyInterest(accounts);
                    break;
                case 9: System.out.println("Thank you for using Bank-O-Matic.");
                    return;
                default:
                    System.out.println("Not a valid number.");
                    break;
            }
        }
    }

    // Displays the menu
    public static void displayMenu() {
        System.out.println("\n\nPlease select from the following menu:");
        System.out.println("\t1. Add an account");
        System.out.println("\t2. Check status of an account");
        System.out.println("\t3. Change the name of an account holder");
        System.out.println("\t4. Deposit money in an account");
        System.out.println("\t5. Withdraw money from an account");
        System.out.println("\t6. Get the interest rate");
        System.out.println("\t7. Set the interest rate");
        System.out.println("\t8. Apply interest to every account");
        System.out.println("\t9. Quit");
    }

    public static void addAccount(ArrayList<BankAccount> accounts, Scanner scanner) {

        System.out.print("Enter the name of the account holder: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Enter the starting balance: ");
        double balance = scanner.nextDouble();        

        accounts.add(new BankAccount(name, balance));
        System.out.println();

        System.out.println("\tThe account has been added.");
        System.out.println("\t" + accounts.get(accounts.size()-1).getName() + " has $" + accounts.get(accounts.size()-1).getBalance() + " and account number #" + accounts.get(accounts.size()-1).getAccountNumber() );
    }

    // Implicitly calls the toString() method on a specified account
    public static void checkStatus(ArrayList<BankAccount> accounts, Scanner scanner) {
        
        System.out.print("Please choose an account number between 1000 and " + accounts.get(accounts.size()-1).getAccountNumber() + ": ");
        int accountNumber = scanner.nextInt();

        System.out.println();

        int index = accounts.indexOf(accountNumber);

        System.out.println("\t" + accounts.get(index + 1).getName() + " has $" + accounts.get(index + 1).getBalance() + " and account number #" + accounts.get(index + 1).getAccountNumber() );


        
    }

    public static void changeAccountHolderName(ArrayList<BankAccount> accounts, Scanner scanner) {
        
        System.out.print("Please choose an account number between 1000 and " + accounts.get(accounts.size()-1).getAccountNumber() + ": ");
        int accountNumber = scanner.nextInt();
        
        int index = accounts.indexOf(accountNumber);

        System.out.println();

        System.out.println("The name is " + accounts.get(index + 1).getName());
        System.out.print("What would you like to change the name to? ");
        scanner.nextLine();
        String newName = scanner.nextLine();

        accounts.get(index +1).setName(newName);

        System.out.println();
        System.out.println();
        System.out.println("\tThe name has been changed.");
        System.out.println("\t" + accounts.get(index + 1).getName() + " has $" + accounts.get(index + 1).getBalance() + " and account number #" + accounts.get(index + 1).getAccountNumber() );
      
    }

    // Adds a specified value to the instance variable 'balance' of a specified account
    public static void deposit(ArrayList<BankAccount> accounts, Scanner scanner) {
        
        System.out.print("Please choose an account number between 1000 and " + accounts.get(accounts.size()-1).getAccountNumber() + ": ");
        int accountNumber = scanner.nextInt();
        
        int index = accounts.indexOf(accountNumber);

        System.out.println();

        System.out.println("The current name is " + accounts.get(index + 1).getName());
        System.out.print("How much would you like to deposit? $");
        double deposit = scanner.nextDouble();

        double currentBalance = accounts.get(index + 1).getBalance();
        accounts.get(index +1).setBalance(currentBalance + deposit);

        System.out.println("The balance for account number " + accounts.get(accounts.size()-1).getAccountNumber() + " is $" + accounts.get(index + 1).getBalance());
        System.out.println();
        System.out.println("\t" + accounts.get(index + 1).getName() + " has $" + accounts.get(index + 1).getBalance() + " and account number #" + accounts.get(index + 1).getAccountNumber() );
       
    }

    public static void withdraw(ArrayList<BankAccount> accounts, Scanner scanner) {
        
        System.out.print("Please choose an account number between 1000 and " + accounts.get(accounts.size()-1).getAccountNumber() + ": ");
        int accountNumber = scanner.nextInt();
        
        int index = accounts.indexOf(accountNumber);

        System.out.println();

        System.out.println("The current name is " + accounts.get(index + 1).getName());
        System.out.print("How much would you like to withdraw? $");
        double withdraw = scanner.nextDouble();

        double currentBalance = accounts.get(index + 1).getBalance();
        accounts.get(index +1).setBalance(currentBalance - withdraw);

        System.out.println("The balance for account number " + accounts.get(accounts.size()-1).getAccountNumber() + " is $" + accounts.get(index + 1).getBalance());
        System.out.println();
        System.out.println("\t" + accounts.get(index + 1).getName() + " has $" + accounts.get(index + 1).getBalance() + " and account number #" + accounts.get(index + 1).getAccountNumber() );
       

    }
    
    // Display the interest rate
    // This is the static class variable that is applied to all BankAccounts
    public static void getInterestRate() {
    
        System.out.println("\tThe current interest rate is " + BankAccount.getInterestRate() + " (or " + (BankAccount.getInterestRate()*100) + "%)");

    }

    // Set the interest rate
    // This is a static reference to 'interestRate' that applies to all BankAccounts
    public static void setInterestRate(Scanner scanner) {
    
        System.out.println("The interest rate is " + BankAccount.getInterestRate() + " (or " + (BankAccount.getInterestRate()*100) + "%)");
        System.out.print("What should the new rate be (enter as a decimal)? ");
        double newRate = scanner.nextDouble();

        BankAccount.setInterestRate(newRate);

        System.out.println();
        System.out.println("\tThe rate has been changed to " + BankAccount.getInterestRate() + " (or " + (BankAccount.getInterestRate()*100) + "%)");
        
    }

    // Walk through every BankAccount in 'accounts' and adjust the balance appropriately
    public static void applyInterest(ArrayList<BankAccount> accounts) {
    
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("Account " + accounts.get(i).getAccountNumber() + " has a balance of " + accounts.get(i).getBalance());


            double currentBalance = accounts.get(i).getBalance();
            double interest = BankAccount.getInterestRate();

            accounts.get(i).setBalance(currentBalance + (interest * 100));
            System.out.println("Account " + accounts.get(i).getAccountNumber() + " has a new balance of " + accounts.get(i).getBalance());
            System.out.println();
        }


    }
}