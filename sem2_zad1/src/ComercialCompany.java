import java.util.LinkedList;

public class ComercialCompany extends Bank{
    public ComercialCompany(String name, double capital, String location, LinkedList<Customer> customers){
        super(name, capital, location, customers);
    }

    @Override
    public void addCustomer(String name, String idNumber, double balance, double creditLimit){
        customers.add(new Customer(name, idNumber,balance,creditLimit));
    }

    @Override
    public void withDraw(String idNumber, double amount){
        for(Customer customer : customers){
            if(customer.getIdNumber().equals(idNumber)){
                if(customer.getBalance() >= amount ){
                    customer.setBalance(customer.getBalance() - amount);
                    System.out.println("Withdraw successful!");
                    return;
                } else{
                    System.out.println("Insufficient balance!");
                    return;
                }
            }
        }
        System.out.println("Customer not found!");
    }

    @Override
    public boolean transfer(String senderIdNumber, String receiveIdNumber, double amount){
        Customer sender = null;
        Customer receiver = null;

        for(Customer customer:customers){
            if(customer.getIdNumber().equals(senderIdNumber)){
                sender=customer;
            }
            if(customer.getIdNumber().equals(receiveIdNumber)){
                receiver = customer;
            }
        }
        if(sender!=null && receiver != null) {
            if (sender.isActive() && receiver.isActive()) {

                if (sender.getBalance() >= amount) {
                    sender.setBalance(sender.getBalance() - amount);
                    receiver.setBalance(receiver.getBalance() + amount);
                    System.out.println("Transfer successfull!");
                    return true;
                } else {
                    System.out.println("Insufficient balance!");
                    return false;
                }
            } else {
                System.out.println("Either sender ir receiver is not active");
                return false;
            }
        } else{
            System.out.println("Sender or receiver not found!");
            return false;
        }
    }
}
