public class Dog extends Animal {
    private String breed;

    private Dog(DogBuilder builder) {
        super(builder);
        this.breed = builder.breed;
    }

    public static class DogBuilder extends AnimalBuilder<DogBuilder> {
        private String breed;

        public DogBuilder breed(String breed) {
            this.breed = breed;
            return this;
        }

        @Override
        protected DogBuilder self() {
            return this;
        }

        @Override
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
        return "Type: Dog\n" + super.showInfo() + "Breed: " + breed + "\n";
    }
}