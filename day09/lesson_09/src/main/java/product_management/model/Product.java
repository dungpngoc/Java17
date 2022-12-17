package product_management.model;

public class Product {
    public int id;
    public String name;
    public String description;
    public int quantity;
    public int price;

    public Product() {}

    public Product(int id, String name, String description, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", description = '" + description + '\'' +
                ", quantity = " + quantity +
                ", price = " + price +
                '}';
    }
}
