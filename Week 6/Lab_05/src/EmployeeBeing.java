import java.util.EmptyStackException;

public class EmployeeBeing implements Behavior, Comparable<EmployeeBeing> {
   private String name;
   private int salary;
   private int dailyStep = 0;
   private static int employeePopulation;

    public EmployeeBeing(String name, int salary) {
        this.name = name;
        this.salary = salary;
        employeePopulation++;
    }

    @Override
    public int step(int actualDailyStep) {
        this.dailyStep = actualDailyStep;
        return dailyStep;
    }

    @Override
    public String tellName() {
        return name;
    }

    @Override
    public int tellSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return
                "Name : " + tellName() + ", " + "Salary : " + tellSalary()
                + ", " + "Step : " + step(dailyStep);
    }


    @Override
    public int compareTo(EmployeeBeing person) {
        if (this.name.equals(person.name) && this.salary == person.salary)
            return 10;
        else if (this.salary == person.salary)
            return 0;
        else if (this.salary < person.salary)
            return -1;
        else return 1;
    }
    public String comparePeople(EmployeeBeing person) {
        if (compareTo(person) == 10)
            return this.name + " and " + person.name + " are the same persons.";
        else if (compareTo(person) == 0)
            return this.name + " and " + person.name + " make the same money.";
        else if (compareTo(person) == -1)
            return this.name + " makes less money than " + person.name;
        else
            return this.name + " makes more money than " + person.name;
    }

    public static int getNumberEmployee() {
        return employeePopulation;
    }

}