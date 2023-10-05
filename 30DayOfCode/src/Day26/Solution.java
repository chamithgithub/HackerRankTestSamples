package Day26;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();

        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();

        int fine = 0;

        if (actualYear > expectedYear) {
            fine = 10000;
        } else if (actualYear == expectedYear && actualMonth > expectedMonth) {
            fine = (actualMonth - expectedMonth) * 500;
        } else if (actualYear == expectedYear && actualMonth == expectedMonth && actualDay > expectedDay) {
            fine = (actualDay - expectedDay) * 15;
        }

        System.out.println(fine);

        scanner.close();
    }
}