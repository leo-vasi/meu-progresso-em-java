public class OtherAnimal extends Animal {

    private String species;

    public OtherAnimal() {
    }

    public OtherAnimal(int age, String name, double weight, String species) {
        super(age, name, weight);
        this.species = species;
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
