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

            score += calculateWaterConsumptionScore(dishwasherFrequency);

            System.out.print("How many times do you run your washing machine per week? ");
            int washingMachineFrequency = input.nextInt();

            score += calculateWaterConsumptionScore(washingMachineFrequency);
        } else {
            System.out.println("You don't have a dishwasher, so no points added.");
        }

        System.out.println("Your water consumption score is: " + score);
    }

    public static int calculateWaterConsumptionScore(int frequency) {
        int points = 0;

        if (frequency > 9) {
            points += 3;
        } else if (frequency >= 4 && frequency <= 9) {
            points += 2;
        } else if (frequency >= 1 && frequency <= 3) {
            points += 1;
        }

        return points;
    }
}