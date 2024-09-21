import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double value) {
        Double result = 0.0;

        if (value >= 1) {
            result = f3(value);
        } else if (value <= 0) {
            result = f1(value);
        } else {
            result = f2(value);
        }
        return result;
    }

    //implement your methods here
    public static Double f1(Double value) {
        return (value * value) + 1;
    }
    public static Double f2(Double value) {
        return 1 / (value * value);
    }
    public static Double f3(Double value) {
        return (value * value) - 1;
    }

}