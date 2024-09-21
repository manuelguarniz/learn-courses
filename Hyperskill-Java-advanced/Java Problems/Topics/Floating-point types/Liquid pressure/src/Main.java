import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        double result = liquidPressure(density, height);
        System.out.println(result);
        scanner.close();
    }

    public static double liquidPressure(double density, double height) {
        return density * height * 9.8;
    }
}