import java.util.Scanner;

public class Userview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usercontroller controller = new Usercontroller(); // Initialize controller here

        while (true) {
            System.out.println("<----------------WELCOME TO SHOPPING----------------->");
            System.out.println("ENTER THE TYPE OF SERVICE YOU WOULD LIKE TO GET!: ");
            System.out.println("1. ADD ITEM TO CART \n2. CHANGE CART ITEMS \n3. SHOW PRODUCT DETAILS BY PRODUCT NAME \n4. SHOW ALL ITEMS IN CART \n5. DELETE ITEM \n6. CALCULATE TOTAL COST \n7. EXIT");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Usermodel product = new Usermodel();
                    System.out.println("Enter product ID: ");
                    product.setProductId(scanner.nextLong());
                    System.out.println("Enter product Name: ");
                    product.setProductName(scanner.next());
                    System.out.println("Enter product Category: ");
                    product.setCategory(scanner.next());
                    System.out.println("Enter product Cost in rupees: ");
                    product.setCost(scanner.nextDouble());
                    
                    if (controller.saveProduct(product)) {
                        System.out.println("Product added to cart successfully :)");
                    } else {
                        System.out.println("Sorry, product cannot be added :(");
                    }
                    break;

                case 2:
                    System.out.println("Enter the Name of the product to be changed: ");
                    String oldName = scanner.next();
                    System.out.println("Enter new product name: ");
                    String newName = scanner.next();
                    System.out.println("Enter new product ID: ");
                    long newId = scanner.nextLong();
                    System.out.println("Enter new product Category: ");
                    String newCategory = scanner.next();
                    System.out.println("Enter new product Cost: ");
                    double newCost = scanner.nextDouble();

                    if (controller.setByName(oldName, newName, newId, newCategory, newCost)) {
                        System.out.println("Item successfully changed");
                    } else {
                        System.out.println("Invalid name");
                    }
                    break;

                case 3:
                    System.out.println("Enter the Name of the product");
                    String productName = scanner.next();
                    controller.showItemsByName(productName);
                    break;

                case 4:
                    controller.showItems();
                    break;

                case 5:
                    System.out.println("Enter the item name to be deleted: ");
                    String nameToDelete = scanner.next();
                    if (controller.deleteItem(nameToDelete)) {
                        System.out.println("Item removed from cart successfully");
                    } else {
                        System.out.println("Invalid item name");
                    }
                    break;

                case 6:
                    controller.totalCost();
                    break;

                case 7:
                    System.out.println("THANKS FOR SHOPPING!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option, please try again.");
            }
            System.out.println();
        }
    }
}
