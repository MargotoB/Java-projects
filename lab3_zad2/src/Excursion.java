public class Excursion extends Puteshestvie implements nightNum{
    private int hotelsNum;

    public int getHotelsNum() {
        return hotelsNum;
    }

    public void setHotelsNum(int hotelsNum) {
        this.hotelsNum = hotelsNum;
    }

    public Excursion(String destination, int days, double price, int hotelsNum){
        super(destination, days, price);
        this.hotelsNum=hotelsNum;
    }

    @Override
    public double fixPrice(double price){
        return price + price*0.1;
    }

    @Override
    public int daysCount(int days){
        return days - 2;
    }
}
