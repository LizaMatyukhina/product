package product;

public class Product {
    private long id;
    private String name;
    private int price;
    private String modelOfProduct;

    Product(long id, String name, int price, String modelOfProduct){
        this.id = id;
        this.name = name;
        this.price = price;
        this.modelOfProduct = modelOfProduct;
    }

    public String getName() {
        return name;
    }

    public long getId(){
        return id;
    }

    public void setPrice() {
        this.price += 1;
    }

    public void getInfo(){
        System.out.println("Уникальный номер: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Модель телефона: " + modelOfProduct);
    }
}
