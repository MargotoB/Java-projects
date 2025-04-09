import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Device implements Serializable {
    private static final long serialVersionUID = 1L;
    private String brand;
    private String model;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price=price;
    }

    public void inputDevice() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter brand: ");
        brand = reader.readLine();
        System.out.print("Enter model: ");
        model = reader.readLine();
        System.out.print("Enter price: ");
        price = Double.parseDouble(reader.readLine());
    }

    public void displayDevice() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}
