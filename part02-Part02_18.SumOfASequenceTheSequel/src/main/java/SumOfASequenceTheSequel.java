
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number?");
        int lastNum = Integer.valueOf(scanner.nextLine());

        int result = 0;

        for (int i = firstNum; i <= lastNum; i++) {
            result += i;
        }

        System.out.println("The sum is: " + result);
        scanner.close();
    }
}
