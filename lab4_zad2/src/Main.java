public class Main {
    public static void main(String[] args) {
        try {
            Books book = new Books(25.0, 123456, "Джордж Оруел", "1984");
            System.out.println("Книга: " + book.getTitle() + " от " + book.getAuthor());
            System.out.println("Цена: " + book.getPrice() + " лв.");
            System.out.println("Промоционална цена: " + book.checkPromo() + " лв.\n");

            TV tv = new TV(1200.0, 789101, "Samsung", "QLED 4K", 150);
            System.out.println("Телевизор: " + tv.getPower() + " модел " + tv.getModel());
            System.out.println("Цена: " + tv.getPrice() + " лв.");
            System.out.println("Промоционална цена: " + tv.checkPromo() + " лв.");

            double consumption = tv.calculateEnergyConsumption(5);
            System.out.println("Разход на електроенергия за 5 часа: " + consumption + " kWh");

        } catch (PowerException e) {
            System.out.println("Грешка: " + e.getMessage());
        }
    }
}