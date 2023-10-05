package Day28;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> gmailUsers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            String firstName = firstMultipleInput[0];
            String emailID = firstMultipleInput[1];

            if (emailID.endsWith("@gmail.com")) {
                gmailUsers.add(firstName);
            }
        }

        Collections.sort(gmailUsers); // Sort the list alphabetically

        for (String name : gmailUsers) {
            System.out.println(name);
        }

        bufferedReader.close();
    }
}