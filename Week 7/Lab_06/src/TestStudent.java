import java.util.Scanner;
public class TestStudent {
    public static void main(String[] args) {
        String name;
        double credit;
        long ID;
        Student st;

        Scanner scan = new Scanner(System.in);

        // a.Read the student’s name and create st
        System.out.println("Enter student's first name");
        name = scan.nextLine();
        st = new Student(name);
        System.out.println("Student " + name + ":");
        System.out.println(st);

        //b.Read the initial credit for the Student and create a new Student
        System.out.println("\nEnter initial credit");
        credit = scan.nextDouble();
        st = new Student(credit, name);
        System.out.println("Student " + name + ":");
        System.out.println(st);

        //c.Prompt for and read the ID for the Student and create a new Student with ID number
        System.out.println("\nEnter Student number");
        ID = scan.nextLong();
        st = new Student(credit, name, ID);
        System.out.println("Student " + name + ":");
        System.out.println(st);

        //d.Increase the credit by 100 and prints the new credit
        System.out.print("\nIncreasing credit by 100, credit is now ");
        st.increase(100);
        System.out.print(st.getCredit());

        //e. Decrease 25 with 2 as bonus and print the new credit
        System.out.print("\nDecreasing 25 with 2 as bonus, credit is now ");
        st.decrease(25, 2);
        System.out.print(st.getCredit());

    }
}
