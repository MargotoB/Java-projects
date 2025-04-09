public class Ship extends Vehicle implements IsSeaVessel{
    private int deadWeight;

    public int getDeadWeight() {
        return deadWeight;
    }

    public void setDeadWeight(int deadWeight) {
        this.deadWeight = deadWeight;
    }

    public Ship(int maxspeed, String model, double price, int deadWeight){
        super(maxspeed, model, price);
        this.deadWeight=deadWeight;
    }

    @Override
    public double checkPromo(){
        double price = getPrice();
        return price = 0.003*price;
    }

    @Override
    public void enterSea(){
        System.out.println("Ship is on water!");
    }
}
