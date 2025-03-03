import java.util.ArrayList;

public class Record {

    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void showAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("There are no registered appointments.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println(appointment.showInfo());
            }
        }
    }
}