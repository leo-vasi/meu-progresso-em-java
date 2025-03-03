public class Dog extends Animal {

    private String breed;

    private Dog(BuilderDog builderDog) {
        super(builderDog.age, builderDog.name, builderDog.weight);
        this.breed = builderDog.breed;
    }

    public static class BuilderDog {
        private int age;
        private String name;
        private double weight;
        private String breed;

        public BuilderDog() {}

        public BuilderDog age(int age) {
            this.age = age;
            return this;
        }

        public BuilderDog name(String name) {
            this.name = name;
            return this;
        }

        public BuilderDog weight(double weight) {
            this.weight = weight;
            return this;
        }

        public BuilderDog breed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
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
