public class Main {
    public static void main(String[] args) {
        Excursion excursion = new Excursion("Spain", 8, 2300, 4);
        Pochivka pochivka = new Pochivka("Turkey", 10, 1700, "Batihan");

        System.out.println("Price of excursion: " + excursion.fixPrice(excursion.getPrice()));
        System.out.println("Price of pochivka: " + pochivka.fixPrice(pochivka.getPrice()));

        System.out.println("Days: " + excursion.daysCount(excursion.getDays()));
    }
}