import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int seedMin = a;
        Map<Integer, Integer> allMaxes = new HashMap<>();

        for (int seed = a; seed <= b; seed++) {
            Random random = new Random(seed);
            for (int j = 0; j < n; j++) {
                int newValue = random.nextInt(k);
                int maxValue = allMaxes.get(seed) == null || allMaxes.get(seed) < newValue ? newValue : allMaxes.get(seed);
                allMaxes.put(seed, maxValue);
            }
            if (allMaxes.get(seedMin) > allMaxes.get(seed)) {
                seedMin = seed;
            }
        }
        System.out.println(seedMin);
        System.out.println(allMaxes.get(seedMin));
    }
}