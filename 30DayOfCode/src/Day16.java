import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();

        try {
            int number = Integer.parseInt(S);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
