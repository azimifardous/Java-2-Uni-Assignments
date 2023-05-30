import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String inputStr = keyboard.next();
        try {
            noUpperCase(inputStr);
            String reversedStr = writingReverse(inputStr);
            System.out.println("The reversed string is: " + reversedStr);
        } catch (UpperCaseException e) {
            System.out.println("The string contains uppercase letter");
        }

    }

    public static String writingReverse(String str) {
        // base case
        if (str.length() <= 1) return str;
        return writingReverse(str.substring(1)) + str.charAt(0);
    }

    public static void noUpperCase(String str) throws UpperCaseException {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                throw new UpperCaseException();
        }
    }
}
