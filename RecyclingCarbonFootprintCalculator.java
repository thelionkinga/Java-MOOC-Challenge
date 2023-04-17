import java.util.Scanner;

public class RecyclingCarbonFootprintCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user if they recycle or not
        System.out.print("Do you recycle? Enter Y for yes, N for no: ");
        char recycleOption = input.nextLine().toUpperCase().charAt(0);

        int points = 0;
        if (recycleOption == 'N') {
            points += 24;
        } else if (recycleOption == 'Y') {
            points += 24;

            // Ask user which recycling categories they do
            System.out.println("Which of the following recycling categories do you recycle? Enter Y for yes, N for no.");
            System.out.print("Glass: ");
            char glassOption = input.nextLine().toUpperCase().charAt(0);
            if (glassOption == 'Y') {
                points -= 4;
            }

            System.out.print("Plastic: ");
            char plasticOption = input.nextLine().toUpperCase().charAt(0);
            if (plasticOption == 'Y') {
                points -= 4;
            }

            System.out.print("Paper: ");
            char paperOption = input.nextLine().toUpperCase().charAt(0);
            if (paperOption == 'Y') {
                points -= 4;
            }

            System.out.print("Aluminum: ");
            char aluminumOption = input.nextLine().toUpperCase().charAt(0);
            if (aluminumOption == 'Y') {
                points -= 4;
            }

            System.out.print("Steel: ");
            char steelOption = input.nextLine().toUpperCase().charAt(0);
            if (steelOption == 'Y') {
                points -= 4;
            }

            System.out.print("Food waste (composting): ");
            char foodWasteOption = input.nextLine().toUpperCase().charAt(0);
            if (foodWasteOption == 'Y') {
                points -= 4;
            }
        }

        // Display result to user
        System.out.println("Your recycling carbon footprint is " + points + " points.");

        input.close();
    }
}