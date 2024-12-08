package entities;

public class Company extends TaxPayer{

    private Integer numOfEmployees;

    public Company(Integer numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public Company(String name, Double anulIncome, Integer numOfEmployees) {
        super(name, anulIncome);
        this.numOfEmployees = numOfEmployees;
    }

    public Integer getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(Integer numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }


    @Override
    public double tax() {
        if (numOfEmployees > 10) {
            return getAnulIncome() * 0.14;
        }
        else {
            return getAnulIncome() * 0.16;
        }
    }
}
