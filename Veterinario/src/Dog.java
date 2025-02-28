public class Dog extends Animal {

    private String breed;

    public Dog() {
    }

    public Dog(int age, String name, double weight, String breed) {
        super(age, name, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String showInfo() {
        return "Type: Dog\n" + super.showInfo() + "\nBreed: " + breed;
    }
}
