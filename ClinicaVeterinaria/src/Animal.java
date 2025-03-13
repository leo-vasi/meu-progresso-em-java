public class Animal {

    private int age;
    private String name;
    private double weight;

    protected Animal(AnimalBuilder<?> builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.weight = builder.weight;
    }

    public static class AnimalBuilder<T extends AnimalBuilder<T>> {
        private int age;
        private String name;
        private double weight;

        public T age(int age) {
            this.age = age;
            return self();
        }

        public T name(String name) {
            this.name = name;
            return self();
        }

        public T weight(double weight) {
            this.weight = weight;
            return self();
        }

        protected T self() {
            return (T) this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String showInfo() {
        return "Age: " + age + "\nName: " + name + "\nWeight: " + weight;
    }
}
