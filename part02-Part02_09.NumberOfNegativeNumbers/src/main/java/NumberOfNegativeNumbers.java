
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNegatives = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0) {
                totalNegatives += 1;
            }

            if (number == 0) {
                scanner.close();
                break;
            }
        }

        System.out.println("Number of negative numbers: " + totalNegatives);
    }
}
