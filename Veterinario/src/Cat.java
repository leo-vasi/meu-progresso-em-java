public class Cat extends Animal {

    private String color;

    public Cat() {
    }

    public Cat(int age, String name, double weight, String color) {
        super(age, name, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String showInfo() {
        return "Type: Cat\n" + super.showInfo() + "\nColor: " + color;
    }
}
