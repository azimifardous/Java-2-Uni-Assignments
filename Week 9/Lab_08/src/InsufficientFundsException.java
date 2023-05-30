public class InsufficientFundsException  extends Exception {
    public InsufficientFundsException(double amount) {
        System.out.println("Sorry, but you are short $" + amount);
    }
}
