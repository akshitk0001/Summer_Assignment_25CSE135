import java.util.*;

public class Fibonacci_series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series: ");
        for(int i=1; i<=n; i++) {
            System.out.print(a + " ");
        int c = a + b;
            a = b;
            b = c;
        }
    }
}