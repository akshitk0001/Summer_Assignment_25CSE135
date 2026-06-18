import java.util.*;

public class Find_common_elements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array size: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter first array elements:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter second array size: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter second array elements:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Common elements are:");
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
