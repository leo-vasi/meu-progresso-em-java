package entities;

public abstract class TaxPayer {
    private String name;
    private Double anulIncome;

    public TaxPayer () {}

    public TaxPayer(String name, Double anulIncome) {
        this.name = name;
        this.anulIncome = anulIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnulIncome() {
        return anulIncome;
    }

    public void setAnulIncome(Double anulIncome) {
        this.anulIncome = anulIncome;
    }

    public abstract double tax();
}
