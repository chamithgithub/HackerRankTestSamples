import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        // Convert the integer to binary representation
        String binaryStr = Integer.toBinaryString(n);

        // Split the binary string by '0' to get an array of consecutive '1's
        String[] consecutiveOnes = binaryStr.split("0");

        // Find the maximum length of consecutive '1's
        int maxConsecutiveOnes = 0;
        for (String onesGroup : consecutiveOnes) {
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, onesGroup.length());
        }

        System.out.println(maxConsecutiveOnes);
    }
}
