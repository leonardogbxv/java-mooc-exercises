
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(i + 1);
        }
    }

}
