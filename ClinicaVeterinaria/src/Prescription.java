public class Prescription {
    private Medication medication;
    private String instructions;
    private double medicationPrice;

    public Prescription(Medication medication, String instructions, double medicationPrice) {
        this.medication = medication;
        this.instructions = instructions;
        this.medicationPrice = medicationPrice;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public double getMedicationPrice() {
        return medicationPrice;
    }

    public void setMedicationPrice(double medicationPrice) {
        this.medicationPrice = medicationPrice;
    }
}