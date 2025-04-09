public class Device {
    private double voltage;
    private String processorModel;
    private boolean isStarted;

    public Device(double voltage, String processorModel, boolean isStarted){
        this.voltage=voltage;
        this.processorModel=processorModel;
        this.isStarted = isStarted;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public void turnOn() {
        if (!isStarted) {
            isStarted = true;
            System.out.println("The device is now ON.");
        } else {
            System.out.println("The device is already ON.");
        }
    }

    public void turnOff() {
        if (isStarted) {
            isStarted = false;
            System.out.println("The device is now OFF.");
        } else {
            System.out.println("The device is already OFF.");
        }
    }
}

