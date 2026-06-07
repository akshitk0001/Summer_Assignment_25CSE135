import java.util.*;

public class nth_term_fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=1; i<n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("nth term fibonacci= " + a);
    }
}