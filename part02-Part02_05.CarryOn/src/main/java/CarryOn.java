
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            System.out.println("Shall we carry on?");

            if (input.equals("no")) {
                scanner.close();
                break;
            }
        }
    }
}
