import java.util.Scanner;

public class ProductDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int inputNum = scanner.nextInt();
        try {
            noPositiveNum(inputNum);
            int productDigits = writingProducts(inputNum);
            System.out.println("Multiplication of the digits of " + inputNum + " is: " + productDigits);
        } catch (NonPositiveException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int writingProducts(int num) {
        // base case - if number contains one digit returns itself
        if (num < 10) return num;
        int lastDigit = num % 10;
        int remainingDigits = num / 10;
        return lastDigit* writingProducts(remainingDigits);

    }

    public static void noPositiveNum(int num) throws NonPositiveException {
        // if the number is a negative number of contains any 0
        if (num < 0 || String.valueOf(num).contains("0"))
            throw new NonPositiveException("The number is negative number or at least one digit contains zero");
    }
}
