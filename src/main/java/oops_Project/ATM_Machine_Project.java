package oops_Project;
import java.util.*;

public class ATM_Machine_Project {

    int balance = 789056431;

    void Menu(String choice, int deposit, int withdraw) {
        switch(choice.toLowerCase()) {
            case "balance":
                System.out.println("Your available balance is " + balance);
                break;

            case "deposit":
                balance += deposit;
                System.out.println("Money deposited: " + deposit);
                System.out.println("Available balance after deposit: " + balance);
                break;

            case "withdraw":
                if(withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Money withdrawn: " + withdraw);
                    System.out.println("Available balance after withdrawal: " + balance);
                } else {
                    System.out.println("Insufficient balance! Your available balance is: " + balance);
                }
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
        ATM_Machine_Project atm = new ATM_Machine_Project();

        System.out.println("Enter your PIN:");
        String pass = s.nextLine();

        if(pass.equals("jyoti@123")) {
            System.out.println("Welcome to our ATM!");

            while(true) {
                System.out.println("Select your choice (balance/deposit/withdraw/exit):");
                String choice = s.nextLine();

                int deposit = 0;
                int withdraw = 0;

                if(choice.equalsIgnoreCase("deposit")) {
                    System.out.println("Enter amount to deposit:");
                    deposit = s.nextInt();
                    s.nextLine(); // consume leftover newline
                } else if(choice.equalsIgnoreCase("withdraw")) {
                    System.out.println("Enter amount to withdraw:");
                    withdraw = s.nextInt();
                    s.nextLine(); // consume leftover newline
                }

                atm.Menu(choice, deposit, withdraw);

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
