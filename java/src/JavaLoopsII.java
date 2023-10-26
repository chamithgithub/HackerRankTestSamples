
import java.util.*;
import java.io.*;

public class JavaLoopsII {
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                // Generate the series
                int currentTerm = a;
                for (int j = 0; j < n; j++) {
                    currentTerm += (int) (Math.pow(2, j) * b);
                    System.out.print(currentTerm + " ");
                }
                System.out.println();
            }
            in.close();
        }
    }