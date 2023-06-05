package estoque;

import java.util.Scanner;

import estoque.entities.Product;

public class Main {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();
        Menu menu = new Menu();

        Product product = main.createProduct();
        menu.homePage(product);

    }

    // Produto inicial
    private Product createProduct() {

        System.out.print("Enter the product name: ");
        String nameProduct = scan.nextLine();

        double priceProduct = 0.0;
        int quantityProduct = 0;
        boolean productValid;

        do {
            try {

                System.out.print("Enter the product price: ");
                priceProduct = scan.nextDouble();
                scan.nextLine();

                System.out.print("Enter the product quantity: ");
                quantityProduct = scan.nextInt();
                scan.nextLine();

                productValid = true;

            } catch (Exception e) {

                System.out.println("Error: Price or Quantity invalids");
                scan.nextLine();

                productValid = false;

            }

        } while (productValid == false);

        Product product = new Product(nameProduct, priceProduct, quantityProduct);

        return product;

    }
}
