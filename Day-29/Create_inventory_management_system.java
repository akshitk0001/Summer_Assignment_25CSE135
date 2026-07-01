import java.util.Scanner;

public class Create_inventory_management_system {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int productId = 0;
        String productName = "";
        double price = 0;
        int quantity = 0;
        boolean productAdded = false;

        int choice;

        do {

            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Sell Product");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    productId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    productName = sc.nextLine();

                    System.out.print("Enter Product Price: ");
                    price = sc.nextDouble();

                    System.out.print("Enter Product Quantity: ");
                    quantity = sc.nextInt();

                    productAdded = true;

                    System.out.println("Product Added Successfully!");
                    break;

                case 2:

                    if(productAdded) {

                        System.out.println("\n----- Product Details -----");
                        System.out.println("Product ID      : " + productId);
                        System.out.println("Product Name    : " + productName);
                        System.out.println("Product Price   : " + price);
                        System.out.println("Available Stock : " + quantity);

                    } else {

                        System.out.println("No Product Available.");
                    }

                    break;

                case 3:

                    if(productAdded) {

                        System.out.print("Enter Quantity to Add: ");
                        int addQty = sc.nextInt();

                        quantity += addQty;

                        System.out.println("Stock Updated Successfully!");
                        System.out.println("Current Stock: " + quantity);

                    } else {

                        System.out.println("No Product Available.");
                    }

                    break;

                case 4:

                    if(productAdded) {

                        System.out.print("Enter Quantity to Sell: ");
                        int sellQty = sc.nextInt();

                        if(sellQty <= quantity) {

                            quantity -= sellQty;

                            double bill = sellQty * price;

                            System.out.println("Product Sold Successfully!");
                            System.out.println("Total Bill = " + bill);
                            System.out.println("Remaining Stock = " + quantity);

                        } else {

                            System.out.println("Insufficient Stock!");
                        }

                    } else {

                        System.out.println("No Product Available.");
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