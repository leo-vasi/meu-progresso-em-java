public class Doctor {

    private String name;
    private int crm;
    private String speciality;


    public static class DoctorBuilder {
        private String name;
        private int crm;
        private String speciality;

        public DoctorBuilder() {}

        public DoctorBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DoctorBuilder crm(int crm) {
            this.crm = crm;
            return this;
        }

        public DoctorBuilder specialty(String specialty) {
            this.speciality = specialty;
            return this;
        }

        public Doctor build() {
            return new Doctor(this);
        }
    }

    private Doctor(DoctorBuilder doctorBuilder) {
        this.name = doctorBuilder.name;
        this.crm = doctorBuilder.crm;
        this.speciality = doctorBuilder.speciality;
    }

    public String showInfo() {
        return "\nName: " + name + "\nCRM: " + crm + "\nSpecialty: " + speciality;
    }
}
