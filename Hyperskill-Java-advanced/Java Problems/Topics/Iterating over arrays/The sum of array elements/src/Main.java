import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String element = scanner.nextLine();
        int sum = Arrays.stream(element.split(" ")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
