import java.util.*;
public class Calculate_sum_of_first_N_natural_numbers{
    //print the sum of first n natural numbers (n=4)
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 0; i<=n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
