
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        String stars = "";

        for (int i = 0; i < number; i++) {
            stars += "*";
        }

        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        String spaces = "";

        for (int i = 0; i <= number; i++) {
            if (i > 0) {
                spaces += " ";
            }
        }

        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 0; i < size; i++) {
            int space = size - 1;

            printSpaces(space - i);
            printStars(i + 1);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 0; i < height; i++) {
            int stars = i + 1;
            int space = height - 1;

            if (i >= 0) {
                stars *= 2;
            }

            printSpaces(space - i);
            printStars(stars - 1);
        }

        printSpaces(height - 2);
        printStars(3);

        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        // christmasTree(6);
        printTriangle(3);
    }
}
