import java.util.Scanner;

class Util {
    public static void print(String value) {
        System.out.println(value);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        if (isDivByThreeAndFive(num)) {
            Util.print("FizzBuzz");
        } else if (isDivByThree(num)) {
            Util.print("Fizz");
        } else if (isDivByFive(num)) {
            Util.print("Buzz");
        } else {
            Util.print("None");
        }
    }
    // function isDivByThree will be here
    public static boolean isDivByThree(int number) {
        return number % 3 == 0;
    }

    // function isDivByFive will be here
    public static boolean isDivByFive(int number) {
        return number % 5 == 0;
    }

    // function isDivByThreeAndFive will be here
    public static boolean isDivByThreeAndFive(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}