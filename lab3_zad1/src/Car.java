public class Car extends Vehicle implements IsLandVehicle{
    private int horsePower;

    public Car(int maxspeed, String model, double price, int horsePower){
        super(maxspeed,model,price);
        this.horsePower = horsePower;
    }
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public double checkPromo(){
        double price = getPrice();
        return price = price * 0.2;
    }

    @Override
    public void enterLand(){
        System.out.println("Car is on land!");
    }
}
