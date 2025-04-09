public class Laptop extends Device{
    private int ramSize;
    private int hardDiskSize;

    public Laptop(double voltage, String processorModel, boolean isStarted, int ramSize, int hardDiskSize) {
        super(voltage,processorModel, isStarted);
        this.ramSize = ramSize;
        this.hardDiskSize = hardDiskSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(int hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public boolean isBetter(Laptop otherLaptop) {
        return this.ramSize > otherLaptop.ramSize && this.hardDiskSize > otherLaptop.hardDiskSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", RAM: " + ramSize + "GB, Hard Disk: " + hardDiskSize + "GB";
    }
}
