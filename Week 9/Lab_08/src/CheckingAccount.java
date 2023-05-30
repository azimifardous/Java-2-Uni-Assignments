public class CheckingAccount {
    private double balance;

    public CheckingAccount() { this.balance = 0; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        double insufficientBalance = amount - balance;
        if (amount > balance) throw new InsufficientFundsException(insufficientBalance);
        else balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
