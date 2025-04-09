public class Main {
    public static void main(String[] args) {
        Car car = new Car(200, "Fiesta", 7500.00, 90);
        Hovercraft hovercraft = new Hovercraft(100, "Hoover", 10000.40, 3 );
        Ship ship = new Ship(250, "Titanic", 130000000, 100);

        car.enterLand();
        hovercraft.enterLand();
        hovercraft.enterSea();
        ship.enterSea();

        System.out.println("Car price: " + car.checkPromo());
        System.out.println("Hovercraft price " + hovercraft.checkPromo());
        System.out.println("Ship price: " + ship.checkPromo());
    }
}