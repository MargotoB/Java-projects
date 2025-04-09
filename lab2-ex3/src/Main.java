public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(19.5, "Intel Core i7", false,16, 512);
        Laptop laptop2 = new Laptop(19.5, "AMD Ryzen 7", false,  8, 256);

        System.out.println("Turning on laptop 1:");
        laptop1.turnOn();

        System.out.println("Turning off laptop 1:");
        laptop1.turnOff();

        System.out.println("Laptop 1 information:");
        System.out.println(laptop1.toString());

        System.out.println("Laptop 2 information:");
        System.out.println(laptop2.toString());

        if (laptop1.isBetter(laptop2)) {
            System.out.println("Laptop 1 is better than Laptop 2.");
        } else {
            System.out.println("Laptop 2 is better or equal to Laptop 1.");
        }
    }
}