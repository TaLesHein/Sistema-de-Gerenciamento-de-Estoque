package estoque;

import java.util.Scanner;

import estoque.entities.Product;

/* 
 *  Classe destinada a interação com o usuário
 */
public class Menu {

    Scanner scan = new Scanner(System.in);

    public void homePage(Product product) {

        Options options = new Options();

        boolean exited = false;
        do {
            System.out.printf("%n======== Home Page =======%n");
            product.infoProduct();
            System.out.println();
            options.seeOptions();
            System.out.printf("==========================%n");

            // Entrada e Validação dos Dados
            boolean optionValid = false;
            int option = -1;

            do {
                System.out.print("Enter option: ");
                option = scan.nextInt();

                optionValid = options.validOption(option);

            } while (optionValid == false);

            product = options.selectOption(option, product);

        } while (exited == false);

    }

    public Product createProduct(Product product) {

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

        product.setName(nameProduct);
        product.setPrice(priceProduct);
        product.setQuantity(quantityProduct);

        return product;

    }

    public Product addStock(Product product) {

        int quantity;
        try {

            System.out.print("Enter the amount to add: ");
            quantity = scan.nextInt();

        } catch (Exception e) {

            System.out.println("Error: Number invalid");
            scan.nextLine();
            return product;
        }

        product.addProducts(quantity);
        return product;

    }

    public Product removeStock(Product product) {

        int quantity;
        try {

            System.out.print("Enter the amount to remove: ");
            quantity = scan.nextInt();

        } catch (Exception e) {

            System.out.println("Error: Number invalid");
            scan.nextLine();
            return product;
        }

        product.removeProducts(quantity);
        return product;

    }

}
