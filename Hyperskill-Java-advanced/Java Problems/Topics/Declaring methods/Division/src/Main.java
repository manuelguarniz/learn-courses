import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static double divide(long a, long b) {
        return a / (double) b;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}