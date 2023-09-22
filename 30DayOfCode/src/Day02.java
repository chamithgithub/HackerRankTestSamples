import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        // Calculate the tip and tax amounts
        double tip = meal_cost * tip_percent / 100.0;
        double tax = meal_cost * tax_percent / 100.0;

        // Calculate the total cost including tip and tax
        double total_cost = meal_cost + tip + tax;

        // Round the total cost to the nearest integer
        int rounded_total_cost = (int) Math.round(total_cost);

        // Print the rounded total cost
        System.out.println(rounded_total_cost);

    }

}


public class Day02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}