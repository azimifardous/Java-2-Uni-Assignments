public class Mortgage {
    private final double RATE = 0.3005;

    private double creditRiskFee(int age, double capital) {
        if (age > 55)
            return (age - 55) * (0.01) * (capital) * (RATE / 12);
        else
            return 0;
    }

    public double calculateInterest(int capital, Person person) {
        return (capital + creditRiskFee(person.getAge(), capital)) * (0.9 + RATE);
    }

    public void restructuringLoan(int newMonthNumber, Person person, double... remainingInstallments) {
        int installments = 0;
        for (int i = 0; i < remainingInstallments.length; i++) {
            installments += remainingInstallments[i];
        }
        double repayment = calculateInterest(installments, person);

        System.out.println("New Mortgage Loan Repayment will be: " + repayment);
        System.out.println("Your new payments will be: " + (repayment / newMonthNumber) + " x " + newMonthNumber);
        System.out.println();
    }
}
