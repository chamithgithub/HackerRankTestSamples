package Day14;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Class constructor that takes an array of integers as a parameter
    public Difference(int[] elements) {
        this.elements = elements;
    }

    // Method to compute the maximum absolute difference between any two numbers
    public void computeDifference() {
        int maxDiff = 0;

        // Iterate through the array to find the maximum difference
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int diff = Math.abs(elements[i] - elements[j]);
                maxDiff = Math.max(maxDiff, diff);
            }
        }

        maximumDifference = maxDiff;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
