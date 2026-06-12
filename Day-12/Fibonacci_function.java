import java.util.*;

public class Fibonacci_function {
    public static void fibonacci(int n) {
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for(int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        fibonacci(n);
    }
}