public class Doctor {

    private String name;
    private int crm;
    private String specialty;

    public Doctor() {
    }

    public Doctor(String name, int crm, String specialty) {
        this.name = name;
        this.crm = crm;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String showInfo() {
        return "\nName: " + name + "\nCRM: " + crm + "\nSpecialty: " + specialty;
    }
}
