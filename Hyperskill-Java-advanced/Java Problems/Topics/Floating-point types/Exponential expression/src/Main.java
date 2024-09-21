import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double result = scannerAndMultiplier(scanner.nextDouble());
        System.out.println(result);
    }

    public static double scannerAndMultiplier(double x) {
        return Math.pow(x, 3) + Math.pow(x, 2) + Math.pow(x, 1) + 1;
    }
}