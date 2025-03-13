public class Appointment {

    private Animal animal;
    private Doctor doctor;
    private String diagnosis;

    private Appointment(AppointmentBuilder builder) {
        this.animal = builder.animal;
        this.doctor = builder.doctor;
        this.diagnosis = builder.diagnosis;
    }

    public static class AppointmentBuilder {
        private Animal animal;
        private Doctor doctor;
        private String diagnosis;

        public AppointmentBuilder() {}

        public AppointmentBuilder animal(Animal animal) {
            this.animal = animal;
            return this;
        }

        public AppointmentBuilder doctor(Doctor doctor) {
            this.doctor = doctor;
            return this;
        }

        public AppointmentBuilder diagnosis(String diagnosis) {
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
