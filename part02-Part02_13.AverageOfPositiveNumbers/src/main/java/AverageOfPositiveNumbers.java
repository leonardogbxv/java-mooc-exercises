
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 0;
        int totalSum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                scanner.close();
                break;
            }

            if (number < 0) {
                continue;
            }

            totalNumbers += 1;
            totalSum += number;
        }

        if (totalNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) totalSum / totalNumbers;
            System.out.println(average);
        }
    }
}
