import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {

        String name;
        double balance;
        long acctNum;
        Account acct;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account holder's first name");

        // a.Read the account holder’s name and create acct
        name = scan.nextLine();
        acct = new Account(name);

        System.out.println("Account for " + name + ":");
        System.out.println(acct);
        System.out.println("\nEnter initial balance");

        // b.Read the initial balance for the account holder and create a new account
        balance = scan.nextDouble();
        acct = new Account(balance, name);

        System.out.println("Account for " + name + ":");
        System.out.println(acct);

        // c.Prompt for and read the account number for the account holder and create a new account with this account number
        System.out.println("\nEnter account number");
        acctNum = scan.nextLong();
        acct = new Account(balance, name, acctNum);

        System.out.println("Account for " + name + ":");
        System.out.println(acct);
        System.out.print("\nDepositing 100 into account, balance is now ");

        // d.Deposit 100$ into account and prints the new balance
        acct.deposit(100);
        System.out.println(acct.getBalance());

        System.out.print("\nWithdrawing $25 with $2 fee, balance is now ");

        //e. Withdraw 25$ with 2$ fee and print the new balance
        acct.withdraw(25, 2);
        System.out.println(acct.getBalance());

    }
}