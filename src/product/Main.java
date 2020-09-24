package product;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductCatalog allProducts = new ProductCatalog();

        Product firstProduct = new Product(55, "", 399, "Green");
        Product secondProduct = new Product(61, "Apple", 599, "Green");
        Product thirdProduct = new Product(13, "PineApple", 199, "NotYet");
        Product fourthProduct = new Product(34, "Pumpkin", 799, "Orange");
        Product fifthProduct = new Product(34, "Apple", 499, "Orange");


        try {
            allProducts.createProduct(firstProduct);
            allProducts.updateProduct(firstProduct);

        } catch (ProductNotValid | ProductAlreadyExists e) {
            System.out.println(e.getMessage());
        }

        try {
            allProducts.deleteProduct(12);

        } catch (ProductNotFound e) {
            System.out.println(e.getMessage());
        }

        try {
            allProducts.createProduct(secondProduct);
            allProducts.createProduct(fifthProduct);

        } catch (ProductAlreadyExists e) {
            System.out.println(e.getMessage());
        }

        try {
            allProducts.updateProduct(thirdProduct);

        } catch (ProductNotFound | ProductNotValid e) {
            System.out.println(e.getMessage());
        }














    }
}


