public class Appointment {

    private Animal animal;
    private Doctor doctor;
    private String diagnosis;

    private Appointment(BuilderAppointment builder) {
        this.animal = builder.animal;
        this.doctor = builder.doctor;
        this.diagnosis = builder.diagnosis;
    }

    public static class BuilderAppointment {
        private Animal animal;
        private Doctor doctor;
        private String diagnosis;

        public BuilderAppointment() {}

        public BuilderAppointment animal(Animal animal) {
            this.animal = animal;
            return this;
        }

        public BuilderAppointment doctor(Doctor doctor) {
            this.doctor = doctor;
            return this;
        }

        public BuilderAppointment diagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }

        public Appointment build() {
            return new Appointment(this);
        }
    }

    public Animal getAnimal() {
        return animal;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String showInfo() {
        return "\nAnimal info: \n" + animal.showInfo() + "\n" +
                "\nDoctor info:\n" + doctor.showInfo() + "\n" +
                "Diagnosis: " + diagnosis;
    }
}
