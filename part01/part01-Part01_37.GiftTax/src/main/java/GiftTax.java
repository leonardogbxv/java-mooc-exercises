
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift < 25000) {
            int tax = 100;
            double taxRate = 0.08;
            double finalTax = tax + (gift - 5000) * taxRate;
            System.out.println("Tax: " + finalTax);
        } else if (gift >= 25000 && gift < 55000) {
            int tax = 1700;
            double taxRate = 0.10;
            double finalTax = tax + (gift - 25000) * taxRate;
            System.out.println("Tax: " + finalTax);
        } else if (gift >= 55000 && gift < 200000) {
            int tax = 4700;
            double taxRate = 0.12;
            double finalTax = tax + (gift - 55000) * taxRate;
            System.out.println("Tax: " + finalTax);
        } else if (gift >= 200000 && gift < 1000000) {
            int tax = 22100;
            double taxRate = 0.15;
            double finalTax = tax + (gift - 200000) * taxRate;
            System.out.println("Tax: " + finalTax);
        } else {
            int tax = 142100;
            double taxRate = 0.17;
            double finalTax = tax + (gift - 1000000) * taxRate;
            System.out.println("Tax: " + finalTax);
        }

    }
}
