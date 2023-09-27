import java.util.Scanner;

public class Day06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int k=0; k <t; k++){
            String a = sc.nextLine();
            for(int i=0 ; i < a.length(); i ++ ){
                if(i % 2 == 0)
                    System.out.print(a.charAt(i));
            }
            System.out.print(" ");
            for(int j=0 ; j < a.length(); j ++ ){
                if(j % 2 != 0)
                    System.out.print(a.charAt(j));
            }
            System.out.println();
        }

    }
}
