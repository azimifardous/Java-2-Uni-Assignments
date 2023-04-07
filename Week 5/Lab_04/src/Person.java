public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final double salary;

    public Person(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public void applyForLoan(Person p, int capital, int month, String loanType) {
        Personal personal = new Personal();
        Vehicle vehicle = new Vehicle();
        Mortgage mortgage = new Mortgage();

        double interest = 0;
        if (loanType.equals("Personal")) interest = personal.calculateInterest(capital, p);
        if (loanType.equals("Vehicle")) interest = vehicle.calculateInterest(capital, p);
        if (loanType.equals("Mortgage")) interest = mortgage.calculateInterest(capital, p);

        double installment = interest / month;
        Boolean isLoanAcceptable = (salary > installment);

        printCreditResult(isLoanAcceptable, capital, p, installment, month, loanType);
    }

    void printCreditResult(Boolean b, int capital, Person person,
                           double installment, int month, String loanType) {
        if (b) {
            System.out.println("Congratulation " + person.getName() + " " + person.getSurname() + "!");
            System.out.println("Your " + loanType + " credit application: " + capital + " has been accepted!");
            System.out.println("Your monthly payment will be: " + installment + " x " + month);
            System.out.println("Repayment costs: " + (installment * month));
            System.out.println();

        } else {
            System.out.println("We are sorry " + person.getName() + " " + person.getSurname() + "!");
            System.out.println("Your " + loanType + " credit application " + capital +
                    " has been rejected because your salary is lower than the installments!");
            System.out.println("Your salary: " + salary + " < " + installment);
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
