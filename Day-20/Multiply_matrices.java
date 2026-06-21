import java.util.*;

public class Multiply_matrices {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = 2;
        int cols = 2;
        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];
        int product[][] = new int[rows][cols];
        System.out.println("Enter elements of first matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                product[i][j] = 0;
                for(int k = 0; k < cols; k++) {
                    product[i][j] = product[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Product Matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}