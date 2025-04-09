public class Main {
    public static void main(String[] args) {
        try {
            CCourse course = new CCourse("Programming 101");

            course.addStudent("Ivan Ivanov", 12345);
            course.addStudent("Maria Petrova", 12346);

            course.addScore(12345, "Math", 5.5);
            course.addScore(12345, "Physics", 4.8);
            course.addScore(12346, "Math", 6.0);

            String[] subjects = {"Math", "Physics"};
            double[] scores = {5.6, 4.2};
            course.addScores(12346, subjects, scores);

            course.displayScores();

        } catch (InvalidStudentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}