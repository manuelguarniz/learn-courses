import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(sumBetween(a, b));

    }
    public static int sumBetween(int a, int b) {
        return IntStream.rangeClosed(a, b).sum();
    }
}