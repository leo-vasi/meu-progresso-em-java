public class OtherAnimal extends Animal {

    private String species;

    private OtherAnimal(OtherAnimalBuilder builder) {
        super(builder);
        this.species = builder.species;
    }

    public static class OtherAnimalBuilder extends AnimalBuilder<OtherAnimalBuilder>{
        private String species;

        public OtherAnimalBuilder species(String species) {
            this.species = species;
            return this;
        }

        @Override
        protected OtherAnimalBuilder self() {
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