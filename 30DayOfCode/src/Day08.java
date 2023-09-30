import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // Consume the newline character after the integer input

        // Create a HashMap to store phone book entries
        Map<String, Integer> phoneBook = new HashMap<>();

        // Populate the phone book
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine(); // Consume the newline character after the integer input
            phoneBook.put(name, phone);
        }

        // Process queries and print results
        while (in.hasNext()) {
            String query = in.next();
            if (phoneBook.containsKey(query)) {
                int phoneNumber = phoneBook.get(query);
                System.out.println(query + "=" + phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
