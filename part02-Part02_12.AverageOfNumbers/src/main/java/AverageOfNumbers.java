
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 0;
        int totalSum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                scanner.close();
                break;
            }

            totalNumbers += 1;

            totalSum += number;
        }

        double average = (double) totalSum / totalNumbers;

        System.out.println("Average of the numbers: " + average);
    }
}
