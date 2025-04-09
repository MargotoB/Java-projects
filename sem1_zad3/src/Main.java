import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] products = {"tomatoes", "cucumbers", "potatoes", "peppers"};
        int[] quantity = {3, 5, 2, 1};
        double[] prices = {4.5, 5.2, 1.7, 2.3};
        double total = 0.0;
        for(int i = 0; i<4; i++){
            double price = quantity[i]*prices[i];
            total += price;
        }
        System.out.println("Total price is " + total);
    }
}