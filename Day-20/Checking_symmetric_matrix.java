import java.util.*;

public class Checking_symmetric_matrix {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = 3;
    int matrix[][] = new int[n][n];
    System.out.println("Enter matrix elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean symmetric = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        if(symmetric) {
            System.out.println("Symmetric Matrix");
        }
        else {
            System.out.println("Not a Symmetric Matrix");
        }
    }
}