import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Create a 2D array to store the input
        int[][] arr = new int[6][6];

        // Read input and populate the array
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = bufferedReader.readLine().split(" ");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        bufferedReader.close();

        // Initialize maxSum to the smallest possible value
        int maxSum = Integer.MIN_VALUE;

        // Iterate through the array to calculate hourglass sums
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int hourglassSum = calculateHourglassSum(arr, i, j);
                maxSum = Math.max(maxSum, hourglassSum);
            }
        }

        // Print the maximum hourglass sum
        System.out.println(maxSum);
    }

    // Helper function to calculate the sum of an hourglass
    private static int calculateHourglassSum(int[][] arr, int row, int col) {
        int sum = 0;
        // Sum the top row of the hourglass
        sum += arr[row][col] + arr[row][col + 1] + arr[row][col + 2];
        // Sum the middle element of the hourglass
        sum += arr[row + 1][col + 1];
        // Sum the bottom row of the hourglass
        sum += arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
        return sum;
    }
}