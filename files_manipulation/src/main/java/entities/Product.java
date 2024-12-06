package entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product(Double price, Integer quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double total() {
        return price * quantity;
    }
}
