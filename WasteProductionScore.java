import java.util.Scanner;

public class WasteProductionScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.print("How many garbage cans do you fill each week? ");
        int numCans = input.nextInt();

        if (numCans == 4) {
            score += 50;
        } else if (numCans == 3) {
            score += 40;
        } else if (numCans == 2) {
            score += 30;
        } else if (numCans == 1) {
            score += 20;
        } else if (numCans < 1.5) {
            score += 5;
        }

        System.out.println("Your waste production score is: " + score);
    }
}