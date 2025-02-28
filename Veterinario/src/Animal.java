public class Animal {

    private int age;
    private String name;
    private double weight;

    public Animal() {
    }

    public Animal(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String showInfo() {
        return "Age: " + age + "\nName: " + name + "\nWeight: " + weight;
    }
}
