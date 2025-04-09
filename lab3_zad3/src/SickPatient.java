public class SickPatient extends Patient{
    private String epikriza;
    private String status;
    private int start;

    public String getEpikriza() {
        return epikriza;
    }

    public void setEpikriza(String epikriza) {
        this.epikriza = epikriza;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public SickPatient(String name, String address, String EGN, String epikriza, String status, int start){
        super(name, address, EGN);
        this.epikriza=epikriza;
        this.status=status;
        this.start = start;
    }

    @Override
    public void cure(String medicine, int quantity){
        System.out.println(getEpikriza() + " , medicine: " + medicine + " is accepted: " + quantity);
    }
}
