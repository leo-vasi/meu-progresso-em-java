import java.util.ArrayList;
import java.util.List;

public class Record {
    private List<Consultation> consultations;

    public Record() {
        this.consultations = new ArrayList<>();
    }

    public void addConsultation(Consultation consultation) {
        consultations.add(consultation);
    }

    public void showConsultations() {
        if (consultations.isEmpty()) {
            System.out.println("No consultations registered yet.");
        } else {
            for (Consultation consultation : consultations) {
                System.out.println(consultation);
                System.out.println("-----------------------------");
            }
        }
    }
}