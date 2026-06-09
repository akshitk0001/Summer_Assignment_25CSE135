import java.util.*;

public class Finding_power {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter power (n): ");
        int n = sc.nextInt();
        int number = 1;
        for(int i = 1; i <= n; i++) {
            number = number * x;
        }
        System.out.println("Answer = " + number);
    }
}