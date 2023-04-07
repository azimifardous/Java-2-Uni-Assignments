public class Personal {
    private final double RATE = 0.3995;

    private double creditRiskFee(int age, double capital) {
        if (age > 55)
            return (age - 55) * (0.02) * capital * (RATE / 12);
        else return 0;
    }

    public double calculateInterest(int capital, Person person) {
        return (capital + creditRiskFee(person.getAge(), capital)) * (1 + RATE);
    }

    public void restructuringLoan(int newMonthNumber, Person person, double... remainingInstallments) {
        int installments = 0;
        for (double remainingInstallment : remainingInstallments)
            installments += remainingInstallment;

        double repayment = calculateInterest(installments, person);

        System.out.println("New Personal Loan Repayment will be: " + repayment);
        System.out.println("Your new payments will be: " + (repayment / newMonthNumber) + " x " + newMonthNumber);
    }
}
