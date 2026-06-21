import java.util.*;

public class Row_wise_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++) {
            int sum = 0;
            for(int j = 0; j < cols; j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }
    }
}