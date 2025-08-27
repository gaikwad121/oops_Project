package oops_Project;
import java.util.*;

public class ATM_Machine_Project {

    // Instance variable for balance
    int balance = 789056431;

    // Method for menu operations
    void Menu(String choice, int deposit) {
        switch (choice.toLowerCase()) {
            case "balance":
                System.out.println("Your available balance is " + balance);
                break;

            case "deposit":
                balance += deposit;
                System.out.println("Money deposited: " + deposit);
                System.out.println("Available balance after deposit: " + balance);
                break;

            case "exit":
                System.out.println("You successfully logged out! Thank you for using ATM.");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ATM_Machine_Project atm = new ATM_Machine_Project(); // creating object

        System.out.println("Enter your PIN:");
        String pass = s.nextLine();

        if(pass.equals("jyoti@123")) {
            System.out.println("Welcome to our ATM!");

            while(true) { // loop for multiple operations
                System.out.println("Select your choice (balance/deposit/exit):");
                String choice = s.nextLine();

                int deposit = 0;
                if(choice.equalsIgnoreCase("deposit")) {
                    System.out.println("Enter amount to deposit:");
                    deposit = s.nextInt();
                    s.nextLine(); // consume leftover newline
                }

                atm.Menu(choice, deposit);

                if(choice.equalsIgnoreCase("exit")) {
                    break;
                }
            }

        } else {
            System.out.println("Invalid account holder! You don't have access to this account.");
        }

        s.close();
    }
}
