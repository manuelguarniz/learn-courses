import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    int field1;
    String field2;
    boolean field3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two integers n and m – the number of scores in each set
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Take two arrays a and b – the score sets
        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<m; i++) {
            b[i] = scanner.nextInt();
        }

        int commonScores = findCommonScores(a, b);

        // Print out the number of common scores
        System.out.println(commonScores);
    }

    // Declare method findCommonScores here
    // This method takes two arrays as parameters and returns an integer
    // This method should contain the logic to find common elements in two arrays
    public static int findCommonScores(int[] array1, int[] array2) {
        int commonScore = 0;
        Set<Integer> cleanArray1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> cleanArray2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());
        for (int i : cleanArray1) {
            for (int j : cleanArray2) {
                if (i == j) {
                    commonScore++;
                }
            }
        }
        return commonScore;
    }
}