import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        int year;
        year = 2024 - age;
        System.out.println("You are born in " + year + " year.");
    }
}