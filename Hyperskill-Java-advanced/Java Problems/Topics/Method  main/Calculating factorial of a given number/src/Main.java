import java.util.Scanner; // 3.1 Import necessary library
import java.util.stream.LongStream;

public class Main { // 3.6 Always use 'Main' as class name

    // 3.0 No method main code here, user write their own
    private static long calculateFactorial(long n) {

        long factorial = LongStream.rangeClosed(1, n)
                .reduce(1, (x, y) -> x * y);
        return factorial;
    }

    public static void main(String[] args) {
        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        long factorial = calculateFactorial(n);

        System.out.println(factorial);
        scanner.close(); // Always close the scanner when done
    }

}