import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxArray  = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int[] elements = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        String inputOrdered = Arrays.stream(elements).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" "));

        System.out.println(input.equals(inputOrdered));
    }
}