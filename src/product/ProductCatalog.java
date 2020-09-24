package product;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private ArrayList<Product> products = new ArrayList<>();


    public List<Product> getAllProducts() {
        return products;
    }

    public void createProduct(Product product) throws ProductAlreadyExists{
        for (Product pr : products) {
            if (pr.getName().equals(product.getName())) {
                throw new ProductAlreadyExists("Продукт с именем " + product.getName() + " уже существует!");
            }}
            {
            products.add(product);

        }}


    public void updateProduct(Product product) throws ProductNotValid, ProductNotFound{
    String now = "nothing";
        if (product.getName().equals("")) {
        throw new ProductNotValid("У продукта " + product.getId() +" не указано имя!");
        }
        for (Product pr : products) {
            if (pr.getId() == product.getId()) {
                pr.setPrice();
                now = "new";
            }
    }
        if (now.equals("nothing")){
            throw new ProductNotFound("Продукт не найден!");
        }
    }

    public void deleteProduct(int id) {
        String now = "nothing";
        for (Product pr : products) {
            if (pr.getId() == id) {
                products.remove(pr);
                now = "new";
            }
        }
        if (now.equals("nothing")){
            throw new ProductNotFound("Продукт не найден!");
        }
    }
    }
