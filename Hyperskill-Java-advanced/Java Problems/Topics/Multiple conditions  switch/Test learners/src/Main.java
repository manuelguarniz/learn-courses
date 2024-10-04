import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        if (number >= 1 && number <= 4) {
            if (number == 1) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        } else {
            System.out.println("Unknown number");
        }
    }
}