import java.util.Scanner;

public class WaterConsumptionScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.print("Do you have a dishwasher? (yes or no): ");
        String hasDishwasher = input.nextLine().toLowerCase();

        if (hasDishwasher.equals("yes")) {
            System.out.print("How many times do you run your dishwasher per week? ");
            int dishwasherFrequency = input.nextInt();

            if (dishwasherFrequency > 9) {
                score += 3;
            } else if (dishwasherFrequency >= 4 && dishwasherFrequency <= 9) {
                score += 2;
            } else if (dishwasherFrequency >= 1 && dishwasherFrequency <= 3) {
                score += 1;
            }

            System.out.print("How many times do you run your washing machine per week? ");
            int washingMachineFrequency = input.nextInt();

            if (washingMachineFrequency > 9) {
                score += 3;
            } else if (washingMachineFrequency >= 4 && washingMachineFrequency <= 9) {
                score += 2;
            } else if (washingMachineFrequency >= 1 && washingMachineFrequency <= 3) {
                score += 1;
            }
        } else {
            System.out.println("You don't have a dishwasher, so no points added.");
        }

        System.out.println("Your water consumption score is: " + score);
    }
}
