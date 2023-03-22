import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String course1 = readCourse();
        String course2 = readCourse();
        String course3 = readCourse();

        compareStrings(course1, course2, course3);

    }

    public static String readCourse() {
        System.out.println("Please enter a course name:");
        var sc = new Scanner(System.in);
        return sc.next();
    }
    private static void compareStrings(String course1, String course2, String course3) {
        // Test Case 1
        if (course1.compareTo(course2) < 0 && course2.compareTo(course3) < 0) {
            System.out.println(course3);
            System.out.println(course2);
            System.out.println(course1);
        }

        // Test Case 2
        if (course2.compareTo(course1) < 0 && course1.compareTo(course3) < 0) {
            System.out.println(course3);
            System.out.println(course1);
            System.out.println(course2);
        }

        // Test Case 3
        if (course3.compareTo(course1) < 0 && course1.compareTo(course2) < 0) {
            System.out.println(course2);
            System.out.println(course1);
            System.out.println(course3);
        }
    }

}
