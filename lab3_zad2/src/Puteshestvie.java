public abstract class Puteshestvie {
    private String destination;
    private int days;
    private double price;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Puteshestvie(String destination, int days, double price){
        this.destination=destination;
        this.days=days;
        this.price=price;
    }

    public abstract double fixPrice(double price);
}
