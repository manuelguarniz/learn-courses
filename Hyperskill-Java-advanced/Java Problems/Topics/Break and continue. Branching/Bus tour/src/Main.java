import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> dataBusBridges = new ArrayList<>();
        // start coding here
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            dataBusBridges.add(value);
            if (dataBusBridges.size() > 2
                    && dataBusBridges.get(1) == dataBusBridges.size() - 2) {
                break;
            }
        }

        int heightBus = dataBusBridges.get(0);
        List<Integer> heightBridges = dataBusBridges.subList(2, dataBusBridges.size());
//        List<String> printingBridges = heightBridges.stream().map(String::valueOf).collect(Collectors.toList());
//        System.out.println(String.join(" ", printingBridges));

        boolean isCrashed = false;
        for (int i = 0; i < heightBridges.size(); i++) {
            if (heightBus >= heightBridges.get(i)) {
                System.out.println("Will crash on bridge " + (i + 1));
                isCrashed = true;
                break;
            }
        }

        if (!isCrashed) {
            System.out.println("Will not crash");
        }
    }
}