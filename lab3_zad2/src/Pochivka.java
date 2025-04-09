public class Pochivka extends Puteshestvie{
    private String hotelName;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Pochivka(String destination, int days, double price, String hotelName) {
        super(destination, days, price);
        this.hotelName = hotelName;
    }

    @Override
    public double fixPrice(double price){
        return price+price*0.4;
    }
}
