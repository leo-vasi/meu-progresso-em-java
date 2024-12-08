package entities;

public class Individual extends TaxPayer{

    private Double healthExpenditure;

    public Individual(String name, Double anulIncome, Double healthExpenditure) {
        super(name, anulIncome);
        this.healthExpenditure = healthExpenditure;
    }

    public Individual(Double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    public Double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(Double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }



    @Override
    public double tax() {
        double basicTax;
        if (getAnulIncome() < 20000.0) {
            basicTax = getAnulIncome() * 15.0 / 100;
        }
        else {
            basicTax = getAnulIncome() * 0.25;
        }
        basicTax -= getHealthExpenditure() * 0.5;
        if (basicTax < 0 ) {
            basicTax = 0;
        }
        return basicTax;
    }
}
