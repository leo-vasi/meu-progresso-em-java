public class Appointment {

    private Animal animal;
    private Doctor doctor;
    private String diagnosis;

    public Appointment() {
    }

    public Appointment(Animal animal, Doctor doctor, String diagnosis) {
        this.animal = animal;
        this.doctor = doctor;
        this.diagnosis = diagnosis;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String showInfo() {
        return "\nAnimal info: \n" + animal.showInfo() + "\n" + "\nDoctor info:\n" + doctor.showInfo() + "\nDiagnosis: " + diagnosis;
    }
}
