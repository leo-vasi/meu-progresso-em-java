package entities;

public enum SandwichSize {
    SMALL(10),
    MEDIUM(15),
    LARGE(20);
    private final int price;

    SandwichSize(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
