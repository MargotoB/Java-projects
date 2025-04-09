public abstract class Stocks {
    private double price;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws PriceException {
        if (price < 0) {
            throw new PriceException();
        }
        this.price = price;
    }

    public Stocks(double price, int number){
        this.price = price;
        this.number = number;
    }

    public abstract double checkPromo();
}
