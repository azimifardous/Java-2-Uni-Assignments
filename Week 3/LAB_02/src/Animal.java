public class Animal {
    private String ID;
    public boolean IsSickorNot;
    private double monthlyMealFee;
    private double donationForThisAnimal = 0;

    // ---------------------------------------------------------------
    // Constructor -- initializes ID, IsSickorNot, monthlyMealFee and donationForThisAnimal
    // ---------------------------------------------------------------

    Animal(String ID, boolean IsSickorNot, double monthlyMealFee, double donationForThisAnimal) {
        this.ID = ID;
        this.IsSickorNot = IsSickorNot;
        this.monthlyMealFee = monthlyMealFee;
        this.donationForThisAnimal = donationForThisAnimal;
    }

    // --------------------------------
    // Changing sickness status by the given ID ve IsSickorNot .
    // If the animal disease status changes to true print that "It got sick !!!" .
    // If the animal disease status changes to false print that "It has recovered !!!"
    // --------------------------------
    public boolean ChangeIsSickorNot(String ID, boolean IsSickorNot) {
        this.IsSickorNot = IsSickorNot;
        if (IsSickorNot)
            System.out.println(ID + " got sick !!!");
        else
            System.out.println(ID + " has recovered !!!");
        return IsSickorNot;
    }

    // --------------------------------
    // Calculate the cost of 1 year of meal fee. Here, if the animal is sick, add $100 to the donation amount.
    // --------------------------------
    public double CalculationDonation (double monthlyMealFee) {
        donationForThisAnimal = monthlyMealFee * 12;
        if (this.IsSickorNot) {
            donationForThisAnimal += 100;
            return donationForThisAnimal + 100;
        }
        else
            return donationForThisAnimal;
    }

    // --------------------------------------------------------------------
    // Returns a string containing the donationForThisAnimal and ID.
    // --------------------------------------------------------------------
    public String toString() {
        return "We need $" + donationForThisAnimal + " for 1-year care of our paw friend who has " + ID;
    }

}
