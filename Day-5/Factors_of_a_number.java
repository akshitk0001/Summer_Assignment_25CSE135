import java.util.*;

public class Factors_of_a_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
  System.out.println("Factors:");
        for(int i=1; i<=n; i++) {
            if(n % i ==0) {
                System.out.print(i +" ");
            }
        }
    }
}