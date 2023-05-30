import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Creating an instance of CheckingAccount Class
        CheckingAccount checkingAccount = new CheckingAccount();

        // having three local variables to work with keyboard values
        double depositAmount, withdrawAmount;
        String command = "";

        // Creating a Scanner to be able to read the user's input
        Scanner keyboard = new Scanner(System.in);

        // Asking for the initial deposit
        System.out.println("Account is created. Do you want to deposit initial money?");

        // Reading depositAmount from the user
        depositAmount = keyboard.nextDouble();

        // Depositing the amount to the account
        checkingAccount.deposit(depositAmount);

        // finally printing the deposit amount
        System.out.println("\n You deposit $" + depositAmount);

        /* Using a while loop to read user's input till they enter 'E' and we break out of the loop
           and end the program
        */
        while (true) {

            System.out.println("Do you want to deposit or withdraw money? D or W\n" + "(E for exit)");
            command = keyboard.next();

            if (command.equals("E"))
                break;
            else if (command.equals("D")) {
                System.out.println("Please enter the amount:");

                depositAmount = keyboard.nextDouble();
                checkingAccount.deposit(depositAmount);

                System.out.println("\n You deposit $" + depositAmount);

            } else if (command.equals("W")){
                System.out.println("Please enter the amount:");

                withdrawAmount = keyboard.nextDouble();
                try {
                    checkingAccount.withdraw(withdrawAmount);
                } catch (InsufficientFundsException e) {
                    e.printStackTrace(System.out); // printing the stack trace (errors' hierarchy)
                    System.out.println("You are exiting, The current amount is $" + checkingAccount.getBalance());
                    break;
                }
                System.out.println(" You withdraw $" + withdrawAmount);
            } else {
                System.out.println("Please enter D, W or E");
            }
        }


    }
}