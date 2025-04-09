public abstract class Vehicle {
    private int maxspeed;
    private String model;
    private double price;

    public Vehicle(int maxspeed, String model, double price){
        this.maxspeed = maxspeed;
        this.model=model;
        this.price=price;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double checkPromo();
}
