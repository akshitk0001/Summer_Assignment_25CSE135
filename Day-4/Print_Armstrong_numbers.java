import java.util.*;

public class Print_Armstrong_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        for(int num=start; num<=end;num++) {
            int n=num;
            int sum=0;
                while(n > 0) {
                int digit = n % 10;
                sum = sum + (digit*digit*digit);
                n = n / 10;
            }
            if(sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}