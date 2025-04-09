import java.util.List;
import java.util.ArrayList;

public class CCourse {

    private List<CStudent> studentList;
    private String name;

    public CCourse(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(String name, int fn) throws InvalidStudentException {
        if (studentList.size() >= 30) {
            throw new InvalidStudentException("Cannot add more students, course is full.");
        }
        studentList.add(new CStudent(name, fn));
    }

    public void addScore(int fn, String subject, double grade) throws InvalidStudentException {
        CStudent student = findStudent(fn);
        if (student == null) {
            throw new InvalidStudentException("Student with FN " + fn + " not found.");
        }
        student.addScore(subject, grade);
    }

    public void addScores(int fn, String[] subjects, double[] grades) throws InvalidStudentException {
        CStudent student = findStudent(fn);
        if (student == null) {
            throw new InvalidStudentException("Student with FN " + fn + " not found.");
        }
        for (int i = 0; i < subjects.length && i < grades.length; i++) {
            student.addScore(subjects[i], grades[i]);
        }
    }

    public void displayScores() {
        for (CStudent student : studentList) {
            System.out.println("Name: " + student.getName());
            System.out.println("Scores: " + student.getScores());
            System.out.println("Average Grade: " + student.getGrade());
            System.out.println("--------------------");
        }
    }

    private CStudent findStudent(int fn) {
        for (CStudent student : studentList) {
            if (student.getFn() == fn) {
                return student;
            }
        }
        return null;
    }
}
