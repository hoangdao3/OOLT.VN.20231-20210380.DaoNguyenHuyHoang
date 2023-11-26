import java.util.Scanner;

public class Bai_8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        // Create an array to store the elements
        double[] numbers = new double[numElements];

        // Input the elements from the user
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Sort the array in ascending order
        java.util.Arrays.sort(numbers);

        // Calculate the sum of array elements
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        // Calculate the average of array elements
        double average = sum / numElements;

        // Display the sorted array, sum, and average
        System.out.println("Sorted Array: ");
        for (double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nSum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);

        scanner.close();
    }
}
