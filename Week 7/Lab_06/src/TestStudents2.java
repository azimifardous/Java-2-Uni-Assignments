import java.util.Scanner;

public class TestStudents2 {
    public static void main(String[] args) {
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name for the first student: ");
        name = sc.nextLine();
        Student st1 = new Student(100, name, 1000);
        System.out.println("First Student");
        System.out.println(st1);

        System.out.print("\nEnter name for the second student: ");
        name = sc.nextLine();
        Student st2 = new Student(150, name, 1100);
        System.out.println("Second Student");
        System.out.println(st2);

        System.out.print("\nEnter name for the third student: ");
        name = sc.nextLine();
        Student st3 = new Student(200, name, 1500);
        System.out.println("Third Student");
        System.out.println(st3);

        System.out.println("Trying to consolidate second and third students.");
        Student consolidatedSt = Student.consolidate(st2, st3);
        if (!(consolidatedSt == null))
            System.out.println(consolidatedSt);
    }
}
