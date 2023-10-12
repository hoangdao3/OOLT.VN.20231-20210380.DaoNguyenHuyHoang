import java.util.Scanner;

public class Bai_8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year, month;
        while (true) {
            System.out.print("Enter a year (non-negative four-digit number): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 0 && String.valueOf(year).length() == 4) {
                    break;
                }
            }
            scanner.nextLine(); // Clear the input buffer
            System.out.println("Invalid year. Please enter a non-negative four-digit number.");
        }

        while (true) {
            System.out.print("Enter a month (e.g., January, Jan., Jan, or 1): ");
            String input = scanner.next().toLowerCase();
            month = getMonth(input);
            if (month != -1) {
                break;
            }
            System.out.println("Invalid month. Please enter a valid month name, abbreviation, or number.");
        }

        int daysInMonth = calculateDaysInMonth(year, month);
        System.out.println("The number of days in the selected month is: " + daysInMonth + " days.");

        scanner.close();
    }

    // Helper method to convert month input to a number
    private static int getMonth(String input) {
        String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        for (int i = 0; i < months.length; i++) {
            if (input.equals(months[i]) || input.equals(months[i].substring(0, 3)) || input.equals(String.valueOf(i + 1))) {
                return i + 1; // Return month number (1-12)
            }
        }
        return -1; // Invalid month input
    }

    // Helper method to calculate the number of days in a month
    private static int calculateDaysInMonth(int year, int month) {
        int[] daysInMonth = {31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }

    // Helper method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
