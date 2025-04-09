import java.io.*;
import java.util.LinkedList;

public class Service{

    public Service(LinkedList<Device> devices, LinkedList<BrokenDevice> brokenDevices) {
        this.devices = devices;
        this.brokenDevices = brokenDevices;
    }

    private LinkedList<Device> devices = new LinkedList<Device>();

    public LinkedList<BrokenDevice> getBrokenDevices() {
        return brokenDevices;
    }

    public void setBrokenDevices(LinkedList<BrokenDevice> brokenDevices) {
        this.brokenDevices = brokenDevices;
    }

    public LinkedList<Device> getDevices() {
        return devices;
    }

    public void setDevices(LinkedList<Device> devices) {
        this.devices = devices;
    }

    private LinkedList<BrokenDevice> brokenDevices = new LinkedList<BrokenDevice>();

    public static void enterDevice(Device device){
        try(ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream("test.txt")))){
            oos.writeObject(device);
        }
        catch (IOException e) {
            System.out.println("Error1!");
        }
    }

    public void readDevice(){
        try(ObjectInputStream ois = new ObjectInputStream((new FileInputStream("test.txt")))){
            Device device = (Device) ois.readObject();
            devices.add(device);
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println("Error2!");
        }
    }

    public void brokenDev(String problem){
        for(BrokenDevice device : brokenDevices){
            device.displayDevice();
        }
    }

    public void removeDevice(BrokenDevice brokenDevice){
        getBrokenDevices().remove();
        getDevices().add(new Device(brokenDevice.getBrand(), brokenDevice.getModel(), brokenDevice.getPrice()));
    }
}
