import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {

        // Declare and initialize variables
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        // Create a Scanner object to read input from stdin
        Scanner scanner = new Scanner(System.in);

        // Read input from stdin
        int i2 = Integer.parseInt(scanner.nextLine());
        double d2 = Double.parseDouble(scanner.nextLine());
        String s2 = scanner.nextLine();

        // Perform operations
        int sumInt = i + i2;
        double sumDouble = d + d2;
        String concatString = s + s2;

        // Print the results
        System.out.println(sumInt);
        System.out.printf("%.1f\n", sumDouble);
        System.out.println(concatString);

        // Close the scanner
        scanner.close();
    }
}
