import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the integer 'n' as input from user
        int n = sc.nextInt();

        // Loop from 1 to 'n' to print the numbers
        int skipValues = 5;
        boolean skipExternalLoop = false;
        for(int i = 1; i <= n; i++) {
            // Include condition to check if 'i' is even
            // If 'i' is 10, skip this number and the next five numbers
            if (skipExternalLoop) {
                if (skipValues == 0) {
                    skipExternalLoop = false;
                } else {
                    skipValues--;
                    continue;
                }
            }
            if (i % 2 == 0) {
                if (i == 10) {
                    skipExternalLoop = true;
                    continue;
                }
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}