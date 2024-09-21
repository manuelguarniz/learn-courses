import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String values = scanner.nextLine();
        int flagElements = Integer.parseInt(scanner.nextLine());

        int result = Arrays.stream(values.split(" "))
                .mapToInt(Integer::parseInt)
                .filter( e -> e > flagElements)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}