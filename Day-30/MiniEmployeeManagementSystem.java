import java.util.Scanner;

public class MiniEmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] empId = new int[100];
        String[] empName = new String[100];
        double[] salary = new double[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== MINI EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;

                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:

                    if(count == 0) {

                        System.out.println("No Employee Records Found.");

                    } else {

                        System.out.println("\n----- Employee Records -----");

                        for(int i = 0; i < count; i++) {

                            System.out.println("Employee ID   : " + empId[i]);
                            System.out.println("Employee Name : " + empName[i]);
                            System.out.println("Salary        : " + salary[i]);
                            System.out.println();
                        }
                    }

                    break;

                case 3:

                    if(count == 0) {

                        System.out.println("No Employee Records Found.");

                    } else {

                        System.out.print("Enter Employee ID to Search: ");
                        int searchId = sc.nextInt();

                        boolean found = false;

                        for(int i = 0; i < count; i++) {

                            if(empId[i] == searchId) {

                                System.out.println("\nEmployee Found");
                                System.out.println("Employee ID   : " + empId[i]);
                                System.out.println("Employee Name : " + empName[i]);
                                System.out.println("Salary        : " + salary[i]);

                                found = true;
                                break;
                            }
                        }

                        if(!found) {

                            System.out.println("Employee Not Found.");
                        }
                    }

                    break;

                case 4:

                    if(count == 0) {

                        System.out.println("No Employee Records Found.");

                    } else {

                        System.out.print("Enter Employee ID: ");
                        int updateId = sc.nextInt();

                        boolean found = false;

                        for(int i = 0; i < count; i++) {

                            if(empId[i] == updateId) {

                                System.out.print("Enter New Salary: ");
                                salary[i] = sc.nextDouble();

                                System.out.println("Salary Updated Successfully!");

                                found = true;
                                break;
                            }
                        }

                        if(!found) {

                            System.out.println("Employee Not Found.");
                        }
                    }

                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}