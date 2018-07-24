package models;

/**
 * Created by COM2-05-PC on 10/7/2561.
 */
public class Product {

    private String id, name, type, size;
    private int price, amount;

    public Product() {
    }

    public Product(String id, String name, String type, String size, int price, int amount) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
        this.amount = amount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
