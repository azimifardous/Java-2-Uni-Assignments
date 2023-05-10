import java.util.Random;
public class Account {
    private double balance;
    private String name;
    private long acctNum;

    public Account(double initBal, String owner, long number) {
        this.balance = initBal;
        this.name = owner;
        this.acctNum = number;
    }

    public Account(double initBal, String owner) {
        this.balance = initBal;
        this.name = owner;
    }

    public Account(String owner) {
        this.name = owner;
    }

    public static Account consolidate(Account acct1, Account acct2){
        if (!(acct1.name.equals(acct2.name)) || acct1.acctNum == acct2.acctNum) {
            System.out.println("Sorry, accounts with different names cannot be consolidated.");
            return null;
        } else {
            System.out.println("Result account is");
            double newBalance = acct1.balance + acct2.balance;
            long newAccNum = acct1.acctNum + acct2.acctNum;
            return new Account(newBalance, acct1.name, newAccNum);
        }
    }

    public void withdraw(double amount){
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    public void withdraw(double amount, double fee) {
        if (balance >= amount)
            balance -= (amount + fee);
        else
            System.out.println("Insufficient funds");
    }

    public void deposit(double amount){
        balance += amount;
    }
    public double getBalance(){
        return balance;
    }

    public String toString(){
        return "Name: " + name + "\nAccount Number: " + acctNum +
                "\nBalance: " + balance;
    }

}