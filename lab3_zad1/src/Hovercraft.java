public class Hovercraft extends Vehicle implements IsLandVehicle,IsSeaVessel{
    private int passengerNum;

    public int getPassengerNum() {
        return passengerNum;
    }

    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    public Hovercraft(int maxspeed, String model, double price, int passengerNum){
        super(maxspeed, model, price);
        this.passengerNum = passengerNum;
    }

    @Override
    public double checkPromo(){
        double price = getPrice();
        return price = 0.03*price;
    }

    @Override
    public void enterLand(){
        System.out.println("Hovercraft is on land!");
    }

    @Override
    public void enterSea(){
        System.out.println("Hovercraft is on water!");
    }
}
