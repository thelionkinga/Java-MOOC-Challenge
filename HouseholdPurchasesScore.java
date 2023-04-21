import java.util.Scanner;

public class HouseholdPurchasesScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.print("How many new pieces of furniture, electronics, or other household gadgets do you buy each year? ");
        int numPurchases = input.nextInt();

        if (numPurchases > 7) {
            score += 10;
        } else if (numPurchases >= 5 && numPurchases <= 7) {
            score += 8;
        } else if (numPurchases >= 3 && numPurchases <= 5) {
            score += 6;
        } else if (numPurchases < 3) {
            score += 4;
        } else {
            score += 2;
        }

        System.out.println("Your household purchases score is: " + score);
    }
}