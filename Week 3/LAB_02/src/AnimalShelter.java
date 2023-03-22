import java.util.Scanner;
public class AnimalShelter {
    public static void main(String[] args) {
        //Register Bella, who lives in the shelter, with ID 2352626 as a patient.
        //Register Cooper, who lives in the shelter, with ID 1235142 as healthy.
        //Register Luna, who lives in the shelter, with ID 2659873 as a patient.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of animals: ");
        int numberOfAnimals = sc.nextInt();
        String[] animalIDs = new String[numberOfAnimals];
        String[] areTheySick = new String[numberOfAnimals];

        for (int i = 0; i < numberOfAnimals; i++) {
            System.out.println("Animal ID: ");
            animalIDs[i] = sc.next();
            System.out.println("Is the Sick(TRUE/FALSE)?");
            areTheySick[i] = sc.next();
        }

        //Add monthly meal fee of all animals (Bella: $20; Cooper: $15; Luna:30)
        Animal Bella = new Animal(animalIDs[0], Boolean.parseBoolean(areTheySick[0]), 20, 0);
        Animal Cooper = new Animal(animalIDs[1], Boolean.parseBoolean(areTheySick[1]), 15, 0);
        Animal Luna = new Animal(animalIDs[2], Boolean.parseBoolean(areTheySick[2]), 30, 0);

        //Bella is now healed, you can change its sickness status to false.(you can use ID)
        Bella.ChangeIsSickorNot(animalIDs[0], false);

        Bella.CalculationDonation(20);
        Cooper.CalculationDonation(15);
        Luna.CalculationDonation(30);

        //print summary for all of animals by toString
        System.out.println(Bella.toString());
        System.out.println(Cooper.toString());
        System.out.println(Luna.toString());

    }
}