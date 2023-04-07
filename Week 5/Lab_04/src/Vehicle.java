public class Vehicle {
    private final double RATE = 0.3495;

    private double creditRiskFee(int age, double capital) {
       if (age >= 35 && age <= 60)
           return 0;
       else return (0.01 * capital) * (RATE / 12);
    }

    public double calculateInterest(int capital, Person person) {
        return (capital + creditRiskFee(person.getAge(), capital)) * (1 + RATE);
    }

    public void restructuringLoan(int newMonthNumber, Person person, double... remainingInstallments) {
        int installments = 0;
        for (int i = 0; i < remainingInstallments.length; i++) {
            installments += remainingInstallments[i];
        }
        double repayment = calculateInterest(installments, person);

        System.out.println("New Vehicle Loan Repayment will be: " + repayment);
        System.out.println("Your new payments will be: " + (repayment / newMonthNumber) + " x " + newMonthNumber);
        System.out.println();
    }
}
