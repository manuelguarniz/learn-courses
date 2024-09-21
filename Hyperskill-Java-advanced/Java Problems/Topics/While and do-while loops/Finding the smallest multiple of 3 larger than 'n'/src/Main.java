import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the input number
        int n = sc.nextInt();
        if (n > 0) {
            while (true) {
                if (n % 3 == 0) {
                    System.out.println(n);
                    break;
                }
                n++;
            }
        } else {
            System.out.println("-1");
        }
        sc.close();
    }
}