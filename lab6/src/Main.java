import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Service service = new Service(new LinkedList<Device>(), new LinkedList<BrokenDevice>());
        Device device1 = new Device("Apple", "Iphone", 2192.23);
        Device device2 = new Device("Huawei", "P20", 234.53);
        Service.enterDevice(device1);
        Service.enterDevice(device2);
        service.readDevice();

        for(Device device : service.getDevices()){
            System.out.println(device.getBrand());
        }
    }
}