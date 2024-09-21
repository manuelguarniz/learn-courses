import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxArray  = Integer.parseInt(scanner.nextLine());
        String element = scanner.nextLine().replaceAll(" ", "");
        String matches = scanner.nextLine();
        String[] intMatches = matches.split(" ");
        String match1 = intMatches[0] + intMatches[1];
        String match2 = intMatches[1] + intMatches[0];

        boolean isMatch = element.contains(match1) || element.contains(match2);
        System.out.println(!isMatch);

    }
}