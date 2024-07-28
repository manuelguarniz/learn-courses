import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            if (result < value) {
                result = value;
            }
        }
        System.out.println(result);
    }
}