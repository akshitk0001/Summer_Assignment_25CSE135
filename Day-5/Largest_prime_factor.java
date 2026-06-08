import java.util.*;

public class Largest_prime_factor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int largest = 0;
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                int count = 0;
                for(int j = 1; j <= i; j++) {
                    if(i % j == 0) {
                        count++;
                    }
                }
                if(count == 2) {
                    largest = i;
                }
            }
        }

        System.out.println("Largest prime factor = " + largest);
    }
}