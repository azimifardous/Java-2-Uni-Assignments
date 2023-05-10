import java.util.Random;
public class Student {
    private double credit;
    private String name;
    private long ID;

    public Student(double initCredit, String name, long ID) {
        this.credit = initCredit;
        this.name = name;
        this.ID = ID;
    }

    public Student(double initCredit, String name) {
        this.credit = initCredit;
        this.name = name;
        this.ID = new Random().nextLong();
    }

    public Student (String name) {
        this.credit = 0;
        this.name = name;
        this.ID = new Random().nextLong();
    }

    public static Student consolidate(Student st1, Student st2){
        if (!(st1.name.equals(st2.name)) || st1.ID == st2.ID) {
            System.out.println("Sorry, students with different names cannot be consolidated.");
            return null;
        } else {
            System.out.println("Result student is");
            long ID = Math.min(st1.ID, st2.ID);
            double credit = Math.max(st1.credit, st2.credit);
            return new Student(credit, st1.name, ID);

        }
    }
    public void decrease(double amount){
        if (credit >= amount)
            credit -= amount;
        else
            System.out.println("Insufficient credits");
    }

    public void decrease(double amount, double bonus) {
        if (credit >= amount)
            credit -= (amount + bonus);
        else
            System.out.println("Insufficient credits");
    }

    public void increase(double amount){
        credit += amount;
    }

    public double getCredit(){
        return credit;
    }

    public String toString(){
        return "Name: " + name + "\nStudent #: " + ID +
                "\nCredit: " + credit;
    }



}
