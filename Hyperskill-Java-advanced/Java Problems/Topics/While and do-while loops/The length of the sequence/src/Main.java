import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        int counter = 0;

        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();

            if (value == 0) {
                System.out.println(counter);
                break;
            }

            if (value > 0) {
                counter++;
            }
        }
    }
}