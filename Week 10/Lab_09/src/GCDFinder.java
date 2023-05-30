import java.util.ArrayList;
import java.util.Scanner;

public class GCDFinder {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);

       int[] numArr = new int[4]; // since it's not defined in the description of the problem

       System.out.print("Enter the integers: ");

       int i = 0;
       while (i < numArr.length) {
           try {
               numArr[i] = keyboard.nextInt();
           } catch (RuntimeException e) {
               System.out.println("This is not a number.");
               break;
           }
           i++;
       }

       int gcd = findGCD(numArr);
       System.out.println("Output: " + gcd);
    }

    private static int findGCD(int[] numbers) {
        int gcd = numbers[0];
        for (int number : numbers)
            gcd = findGCD(gcd, number);
        return gcd;
    }

    private static int findGCD(int a, int b) {
        if (b == 0) return a;
        else if (a % b == 0) return b;
        else return findGCD(b, a % b);
    }

}