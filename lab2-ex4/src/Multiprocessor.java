public class Multiprocessor {
    private int processorNum;
    private int qdraNum;
    private int taktChestota;

    public Multiprocessor(int processorNum, int qdraNum, int taktChestota) {
        this.processorNum = processorNum;
        this.qdraNum = qdraNum;
        this.taktChestota = taktChestota;
    }

    public int getProcessorNum() {
        return processorNum;
    }

    public void setProcessorNum(int processorNum) {
        this.processorNum = processorNum;
    }

    public int getQdraNum() {
        return qdraNum;
    }

    public void setQdraNum(int qdraNum) {
        this.qdraNum = qdraNum;
    }

    public int getTaktChestota() {
        return taktChestota;
    }

    public void setTaktChestota(int taktChestota) {
        this.taktChestota = taktChestota;
    }

    public double taktChestotaPreobrazuvame(){
        double processorFactor = (processorNum > 1) ? 0.7 * processorNum:1;
        double qdraFactor = (qdraNum > 1) ? 0.8*qdraNum:1;
        return processorFactor*qdraFactor*taktChestota;
    }

    public double calculateOperation(double time){
        double seqClock=taktChestotaPreobrazuvame();
        return time*taktChestota/seqClock;
    }

    @Override
    public String toString(){
        return "MultiProcessor: " +
                "CPUs = " + processorNum +
                ", cores = " + processorNum +
                ", taktova chestota" +
    }
}
