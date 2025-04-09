import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrokenDevice extends Device{
    private String problem;
    private int daysToRepair;

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public int getDaysToRepair() {
        return daysToRepair;
    }

    public void setDaysToRepair(int daysToRepair) {
        this.daysToRepair = daysToRepair;
    }

    public BrokenDevice(String brand, String model, double price, String problem, int daysToRepair) {
        super(brand, model, price);
        this.problem = problem;
        this.daysToRepair = daysToRepair;
    }

    @Override
    public void inputDevice() throws IOException {
        super.inputDevice();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter problem: ");
        problem = reader.readLine();
        System.out.print("Enter repair time(in days): ");
        daysToRepair = Integer.parseInt(reader.readLine());
    }

    @Override
    public void displayDevice() {
        super.displayDevice();
        System.out.println("Symptoms: " + problem + ", Repair Time: " + daysToRepair + " days");
    }
}
