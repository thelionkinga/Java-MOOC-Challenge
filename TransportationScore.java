import java.util.Scanner;

public class TransportationScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.print("How many miles do you travel in your personal vehicle per year? ");
        int personalMiles = input.nextInt();

        if (personalMiles > 15000) {
            score += 12;
        } else if (personalMiles >= 10000) {
            score += 10;
        } else if (personalMiles >= 1000) {
            score += 6;
        } else if (personalMiles < 1000 && personalMiles >= 0) {
            score += 4;
        }

        System.out.print("How many miles do you travel on public transportation per year? ");
        int publicMiles = input.nextInt();

        if (publicMiles > 20000) {
            score += 12;
        } else if (publicMiles >= 15000) {
            score += 10;
        } else if (publicMiles >= 10000) {
            score += 6;
        } else if (publicMiles >= 1000) {
            score += 4;
        } else if (publicMiles < 1000 && publicMiles >= 0) {
            score += 2;
        }

        System.out.print("How far do you travel by plane per year? ");
        int flightMiles = input.nextInt();

        if (flightMiles < 1000) {
            score += 2;
        } else if (flightMiles >= 1000 && flightMiles < 5000) {
            score += 6;
        } else if (flightMiles >= 5000) {
            score += 20;
        }

        System.out.println("Your transportation score is: " + score);
    }
}