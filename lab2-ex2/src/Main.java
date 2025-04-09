public class Main {
    public static void main(String[] args)
    {
        Student student = new Student("Georgi", "03.12.2004", "121223007",
                4.2,5.2, 3.9 );
        System.out.println("Initial Information:");
        student.PrintInfo();

        student.modifyGrades(6.0, 5.8, 5.5);

        System.out.println("Information after exam:");
        student.PrintInfo();
    }
}