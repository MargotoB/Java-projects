import java.util.LinkedList;

abstract class Bank {
    protected String name;
    protected double capital;
    protected String location;
    protected LinkedList<Customer> customers;

    public Bank(String name, double capital, String location, LinkedList<Customer> customers){
        this.name=name;
        this.capital=capital;
        this.location=location;
        this.customers = new LinkedList<>();
    }

    public abstract void addCustomer(String name, String idNumber, double balance, double creditLimit);

    public abstract void withDraw(String idNumber, double amount);

    public abstract boolean transfer(String senderNumber, String recieverIdNUmber, double amount);

    public void displayCustomer(){
        System.out.println("Customers: ");
        for(Customer customer : customers){
            System.out.println(customer);
        }
    }
}
