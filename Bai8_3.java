import java.util.Scanner;

public class Bai8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the triangle (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer for the height of the triangle.");
        } else {
            // Loop to print the triangle
            for (int i = 1; i <= n; i++) {
                // Print spaces before stars
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }

                System.out.println(); // Move to the next line
            }
        }

        scanner.close();
    }
}
