public class OtherAnimal extends Animal {

    private String species;

    private OtherAnimal(BuilderOtherAnimal builderOtherAnimal) {
        super(builderOtherAnimal.age, builderOtherAnimal.name, builderOtherAnimal.weight);
        this.species = builderOtherAnimal.species;
    }

    public static class BuilderOtherAnimal {
        private int age;
        private String name;
        private double weight;
        private String species;


        public BuilderOtherAnimal() {}

        public BuilderOtherAnimal age(int age) {
            this.age = age;
            return this;
        }

        public BuilderOtherAnimal name(String name) {
            this.name = name;
            return this;
        }

        public BuilderOtherAnimal weight(double weight) {
            this.weight = weight;
            return this;
        }

        public BuilderOtherAnimal species(String species) {
            this.species = species;
            return this;
        }

        public OtherAnimal build() {
            return new OtherAnimal(this);
        }


    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String showInfo() {
        return "Type: Other\n" + super.showInfo() + "\nSpecies: " + species;
    }
}