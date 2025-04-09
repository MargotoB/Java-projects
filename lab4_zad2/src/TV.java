public class TV extends Stocks implements ElectricalAppliance {
    private String proizvoditel;
    private String model;
    private double power;

    public TV(double price, int number, String proizvoditel, String model, double power) throws PowerException {
        super(price, number);
        this.proizvoditel = proizvoditel;
        this.model = model;
        setPower(power);
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) throws PowerException {
        if (power <= 0) {
            throw new PowerException();
        }
        this.power = power;
    }

    @Override
    public double checkPromo() {
        return getPrice() * 0.91;
    }

    @Override
    public double calculateEnergyConsumption(double hours) throws PowerException {
        if (hours < 0) {
            throw new PowerException();
        }
        return (power / 1000) * hours;
    }
}