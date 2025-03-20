import java.time.LocalDate;

public class Consultation {
    private Animal animal;
    private Owner owner;
    private Doctor doctor;
    private String diagnosis;
    private LocalDate date;
    private LocalDate returnDate;
    private double consultationPrice;
    private Prescription prescription;
    private Priority priority;

    private Consultation(ConsultationBuilder builder) {
        this.animal = builder.animal;
        this.owner = builder.owner;
        this.doctor = builder.doctor;
        this.diagnosis = builder.diagnosis;
        this.date = builder.date;
        this.returnDate = builder.returnDate;
        this.consultationPrice = builder.consultationPrice;
        this.prescription = builder.prescription;
        this.priority = builder.priority;
    }

    public static class ConsultationBuilder {
        private Animal animal;
        private Owner owner;
        private Doctor doctor;
        private String diagnosis;
        private LocalDate date;
        private LocalDate returnDate;
        private double consultationPrice;
        private Prescription prescription;
        private Priority priority;

        public ConsultationBuilder animal(Animal animal) {
            this.animal = animal;
            return this;
        }

        public ConsultationBuilder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        public ConsultationBuilder doctor(Doctor doctor) {
            this.doctor = doctor;
            return this;
        }

        public ConsultationBuilder diagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }

        public ConsultationBuilder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public ConsultationBuilder returnDate(LocalDate returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public ConsultationBuilder consultationPrice(double consultationPrice) {
            this.consultationPrice = consultationPrice;
            return this;
        }

        public ConsultationBuilder prescription(Prescription prescription) {
            this.prescription = prescription;
            return this;
        }

        public ConsultationBuilder priority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public Consultation build() {
            return new Consultation(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal: \n").append(formatAnimalInfo(animal)).append("\n");
        sb.append("Owner: \n").append(formatOwnerInfo(owner)).append("\n");
        sb.append("Doctor: \n").append(formatDoctorInfo(doctor)).append("\n");
        sb.append("Diagnosis: ").append(diagnosis).append("\n");
        sb.append("Date: ").append(date).append("\n");
        sb.append("Return Date: ").append(returnDate != null ? returnDate : "Not scheduled").append("\n");
        sb.append("Consultation Price: ").append(formatCurrency(consultationPrice)).append("\n");
        sb.append("Prescription: ").append(prescription != null ? formatPrescriptionInfo(prescription) : "No prescription").append("\n");
        sb.append("Priority: ").append(priority).append("\n");
        return sb.toString();
    }

    private static String formatAnimalInfo(Animal animal) {
        StringBuilder sb = new StringBuilder();
        sb.append("  Type: ").append(animal instanceof Cat ? "Cat" : animal instanceof Dog ? "Dog" : "Other").append("\n");
        sb.append("  Age: ").append(animal.getAge()).append("\n");
        sb.append("  Name: ").append(animal.getName()).append("\n");
        sb.append("  Weight: ").append(animal.getWeight()).append("\n");
        if (animal instanceof Cat) {
            sb.append("  Color: ").append(((Cat) animal).getColor()).append("\n");
        } else if (animal instanceof Dog) {
            sb.append("  Breed: ").append(((Dog) animal).getBreed()).append("\n");
        }
        return sb.toString();
    }

    private static String formatOwnerInfo(Owner owner) {
        return "  Name: " + owner.getName() + "\n  Phone: " + owner.getPhoneNumber();
    }

    private static String formatDoctorInfo(Doctor doctor) {
        return "  Name: " + doctor.getName() + "\n  CRM: " + doctor.getCrm() + "\n  Specialty: " + doctor.getSpeciality();
    }

    private static String formatPrescriptionInfo(Prescription prescription) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n  Medication: ").append(prescription.getMedication().getName()).append("\n");
        sb.append("  Dosage: ").append(prescription.getMedication().getDosage()).append("\n");
        sb.append("  Instructions: ").append(prescription.getInstructions()).append("\n");
        sb.append("  Price: ").append(formatCurrency(prescription.getMedicationPrice()));
        return sb.toString();
    }

    private static String formatCurrency(double value) {
        return "R$ " + String.format("%.2f", value);
    }
}
