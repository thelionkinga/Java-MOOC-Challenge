import java.util.Scanner;

public class RecyclingScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 24;

        System.out.print("Do you recycle? (yes/no) ");
        String response = input.next();

        if (response.equalsIgnoreCase("no")) {
            score += 24;
        } else {
            System.out.print("What items do you recycle? (comma-separated list, e.g. Glass,Plastic,Paper) ");
            String items = input.next();

            String[] itemList = items.split(",");
            int numItems = itemList.length;

            score += (24 - (4 * numItems));
        }

        System.out.println("Your recycling score is: " + score);
    }
}