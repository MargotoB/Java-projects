public class Person {
    private String name;
    private String birthDate;

    public Person(String name, String birthDate){
        this.name=name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void PrintInfo(){
        System.out.println("Name: " + name);
        System.out.println("Bithday date: " + birthDate);
    }
}
