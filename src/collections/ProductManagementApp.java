package collections;

import java.util.ArrayList;
import java.util.Scanner;
public class ProductManagementApp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"Stylo",20));
        products.add(new Product(2,"laptop",150));
        products.add(new Product(7,"souris",200));
        System.out.println("Initial product list:");
        products.forEach(System.out::println);
        products.remove(0);
        System.out.println("\nAfter deletion:");
        products.forEach(System.out::println);
        products.get(1).setPrice(800);
        System.out.println("After modification:");
        products.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name to search:");
        String nameTosearch=scanner.nextLine();
        products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(nameTosearch))
                .forEach(System.out::println);
    }
}

//System.out::println equivalent a p -> System.out.println(p)

