import java.util.*;

public class Armstrong_function {
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
            while(n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        return original == sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(isArmstrong(n)) {
            System.out.println("It is an armstrong Number");
        } else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}