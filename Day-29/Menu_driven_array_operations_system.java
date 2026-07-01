import java.util.*;

public class Menu_driven_array_operations_system {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];
        int size = 0;
        int choice;

        do {

            System.out.println("\n====== Array Operations ======");
            System.out.println("1. Input Array");
            System.out.println("2. Display Array");
            System.out.println("3. Find Sum");
            System.out.println("4. Find Largest Element");
            System.out.println("5. Search Element");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter size of array: ");
                    size = sc.nextInt();

                    System.out.println("Enter " + size + " elements:");

                    for(int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }

                    System.out.println("Array Stored Successfully!");
                    break;

                case 2:

                    if(size == 0) {
                        System.out.println("Array is Empty.");
                    }
                    else {

                        System.out.print("Array Elements: ");

                        for(int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }

                        System.out.println();
                    }

                    break;

                case 3:

                    if(size == 0) {
                        System.out.println("Array is Empty.");
                    }
                    else {

                        int sum = 0;

                        for(int i = 0; i < size; i++) {
                            sum += arr[i];
                        }

                        System.out.println("Sum = " + sum);
                    }

                    break;

                case 4:

                    if(size == 0) {
                        System.out.println("Array is Empty.");
                    }
                    else {

                        int largest = arr[0];

                        for(int i = 1; i < size; i++) {

                            if(arr[i] > largest) {
                                largest = arr[i];
                            }
                        }

                        System.out.println("Largest Element = " + largest);
                    }

                    break;

                case 5:

                    if(size == 0) {
                        System.out.println("Array is Empty.");
                    }
                    else {

                        System.out.print("Enter element to search: ");
                        int key = sc.nextInt();

                        boolean found = false;

                        for(int i = 0; i < size; i++) {

                            if(arr[i] == key) {

                                System.out.println("Element Found at Index " + i);
                                found = true;
                                break;
                            }
                        }

                        if(!found) {
                            System.out.println("Element Not Found.");
                        }
                    }

                    break;

                case 6:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while(choice != 6);
    }
}