import java.util.*;

public class PerfectNumber_function {

    public static boolean isPerfect(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum = sum + i;
            }
        }
        return sum == n;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(isPerfect(n)) {
            System.out.println("It is a perfect Number");
        } else {
            System.out.println("It is not a perfect Number");
        }
    }
}