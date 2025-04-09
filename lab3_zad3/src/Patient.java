import java.util.Scanner;

public abstract class Patient {
    private String name;
    private String address;
    private String EGN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }

    public Patient(String name, String address, String EGN){
        this.name=name;
        this.address=address;
        this.EGN = EGN;
    }

    public abstract void cure(String medicine, int quantity);

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        setName(scanner.nextLine());
        System.out.println("Enter address: ");
        setAddress((scanner.nextLine()));
        System.out.println("Enter EGN: ");
        setEGN(scanner.nextLine());
    }

    public void output(){
        System.out.println("Name: " + getName() + " Address: " + getAddress() + " EGN: " + getEGN());
    }
}
