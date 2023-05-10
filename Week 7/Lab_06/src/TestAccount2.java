import java.util.Scanner;

public class TestAccount2 {
    public static void main(String[] args) {
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name for first account: ");
        name = sc.nextLine();
        Account acct1 = new Account(100, name, 1000);
        System.out.println("First Account");
        System.out.println(acct1);

        System.out.print("\nEnter name for second account: ");
        name = sc.nextLine();
        Account acct2 = new Account(100, name, 1100);
        System.out.println("Second Account");
        System.out.println(acct2);

        System.out.print("\nEnter name for third account: ");
        name = sc.nextLine();
        Account acct3 = new Account(100, name, 1500);
        System.out.println("Third Account");
        System.out.println(acct3);

        System.out.println("Trying to consolidate second and third accounts.");
        Account consolidatedAcc = Account.consolidate(acct2, acct3);
        if (!(consolidatedAcc == null))
            System.out.println(consolidatedAcc);
    }
}
