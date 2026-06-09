import java.util.*;

public class Set_bits_counter{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0) {
            int bit = n % 2;
            if(bit == 1) {
                count++;
            }
              n = n / 2;
        }
        System.out.println("Set bits = " + count);
    }
}