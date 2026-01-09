package Generics;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display products");
            System.out.println("2. Search product by id");
            System.out.println("3. Add new product");
            System.out.println("4. Delete product by id");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    metier.getAll().forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("Enter id: ");
                    long id = scanner.nextLong();
                    Product p = metier.findById(id);
                    System.out.println(p != null ? p : "Product not found");
                    break;

                case 3:
                    System.out.print("Id: ");
                    long newId = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Brand: ");
                    String brand = scanner.nextLine();

                    System.out.print("Price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();

                    metier.add(new Product(newId, name, brand, price, "No description", stock));
                    break;

                case 4:
                    System.out.print("Enter id to delete: ");
                    long deleteId = scanner.nextLong();
                    metier.delete(deleteId);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}

