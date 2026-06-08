import java.util.*;

public class Check_strong_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int main = n;
        int sum = 0;
        while(n > 0) {
            int number= n % 10;
            int factorial = 1;
            for(int i=1; i<=number; i++) {
                factorial = factorial * i;
            }
            sum = sum + factorial;
            n = n / 10;
        }
        if(sum == main) {
            System.out.println("It is a strong number");
        } else {
            System.out.println("It is not a strong number");
        }
    }
}