package estoque;

import estoque.entities.Product;

/*  Classe destinada a manipulação de opções, em forma de saída de dados,
 *   validação de dados e seleção de opção.
 */

public class Options {

    String options[] = new String[4];

    public Options() {

        options[0] = "[0] Create new Product";
        options[1] = "[1] Add Product in Stock";
        options[2] = "[2] Remove Product in Stock";
        options[3] = "[3] Exit";

    }

    public void seeOptions() {

        for (int i = 0; i < options.length; i++) {

            System.out.println(options[i]);

        }
    }

    public boolean validOption(int option) {

        if (option <= this.options.length - 1 && option >= 0) {

            return true;
        } else {
            System.out.println("Error: Option is invalid");
            return false;
        }

    }

    public Product selectOption(int option, Product product) {

        Menu menu = new Menu();
        switch (option) {

            case 0:
                product = menu.createProduct(product);
                return product;

            case 1:
                product = menu.addStock(product);
                return product;

            case 2:
                product = menu.removeStock(product);
                return product;

            case 3:
                System.out.println("Thanks for testing");
                System.exit(0);
            default:
                return product;
        }
    }

    public String[] getOptions() {
        return options;
    }

}
