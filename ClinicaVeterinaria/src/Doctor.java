public class Doctor {

    private String name;
    private int crm;
    private String specialty;


    public static class BuilderDoctor {
        private String name;
        private int crm;
        private String specialty;

        public BuilderDoctor() {}

        public BuilderDoctor name(String name) {
            this.name = name;
            return this;
        }

        public BuilderDoctor crm(int crm) {
            this.crm = crm;
            return this;
        }

        public BuilderDoctor specialty(String specialty) {
            this.specialty = specialty;
            return this;
        }

        public Doctor build() {
            return new Doctor(this);
        }
    }

    private Doctor(BuilderDoctor builderDoctor) {
        this.name = builderDoctor.name;
        this.crm = builderDoctor.crm;
        this.specialty = builderDoctor.specialty;
    }

    public String showInfo() {
        return "\nName: " + name + "\nCRM: " + crm + "\nSpecialty: " + specialty;
    }
}
