//Consider how much waste you produce. The more trash cans you fill each week, the larger your carbon footprint will be. Count up how many times you fill your garbage cans each week and then assign points based on these numbers.[4]
//If you fill 4 garbage cans each week, then add 50 points.
//If you fill 3 garbage cans each week, then add 40 points.
//If you fill 2 garbage cans per week, then add 30 points.
// If you fill 1 garbage can per week, then add 20 points.
//  If you fill half of a garbage can or less per week, then add 5 points.

import java.util.Scanner;

public class WasteCarbonFootprintCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user how many garbage cans they fill each week
        System.out.print("Enter the number of garbage cans you fill each week: ");
        int garbageCansFilled = input.nextInt();

        // Assign points based on number of garbage cans filled
        int points = 0;
        if (garbageCansFilled >= 4) {
            points += 50;
        } else if (garbageCansFilled == 3) {
            points += 40;
        } else if (garbageCansFilled == 2) {
            points += 30;
        } else if (garbageCansFilled == 1) {
            points += 20;
        } else {
            points += 5;
        }

        // Display result to user
        System.out.println("Your waste carbon footprint is " + points + " points.");

        input.close();
    }
}
