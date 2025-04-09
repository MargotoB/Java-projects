import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String customerName = scanner.next();
        System.out.println("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        System.out.println("Enter loyality level: ");
        String loyalityLevel = scanner.next();

        switch(loyalityLevel){
            case "bronse":
                purchaseAmount = 0.9*purchaseAmount;
                break;
            case "silver":
                purchaseAmount = 0.8*purchaseAmount;
                break;
            case "gold":
                purchaseAmount = 0.7*purchaseAmount;
                break;
            case "diamond":
                purchaseAmount = 0.5*purchaseAmount;
                break;
            default:
                purchaseAmount = purchaseAmount;
        }

        System.out.println("Total purchase amount after discount is: " + purchaseAmount);
    }
}