public class Student extends Person{
    private String facNum;
    private double gradePIK;
    private double gradeTE;
    private double gradePPE;

    public Student(String name, String birthDate, String facNum, double gradePIK, double  gradeTE, double gradePPE){
        super(name, birthDate);
        this.facNum = facNum;
        this.gradePIK = gradePIK;
        this.gradeTE = gradeTE;
        this.gradePPE = gradePPE;
    }

    public String getFacNum() {
        return facNum;
    }

    public void setFacNum(String facNum) {
        this.facNum = facNum;
    }

    public double getGradePIK() {
        return gradePIK;
    }

    public void setGradePIK(double gradePIK) {
        this.gradePIK = gradePIK;
    }

    public double getGradeTE() {
        return gradeTE;
    }

    public void setGradeTE(double gradeTE) {
        this.gradeTE = gradeTE;
    }

    public double getGradePPE() {
        return gradePPE;
    }

    public void setGradePPE(double gradePPE) {
        this.gradePPE = gradePPE;
    }

    public void modifyGrades(double gradePIK, double gradeTE, double gradePPE) {
        this.gradePIK = gradePIK;
        this.gradeTE = gradeTE;
        this.gradePPE = gradePPE;
    }

    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("Fac number: " + facNum);
        System.out.println("Grade PIK: " + gradePIK);
        System.out.println("Grade TE: " + gradeTE);
        System.out.println("Grade PPE: " + gradePPE);
    }
}

