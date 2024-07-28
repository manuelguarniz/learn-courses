import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = new ArrayList<>();

        do {
            sequence.add(scanner.nextInt());
        } while (sequence.size() < (sequence.get(0) + 1));

        sequence.remove(0);
        sequence.stream()
                .filter(e -> e % 4 == 0)
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }
}