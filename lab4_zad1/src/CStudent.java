public class CStudent {
    private String name;
    private int fn;
    private String[] subjects;
    private double[] scores;
    private int scoreCount;

    public void setName(String name) {
        this.name = name;
    }

    public void setFn(int fn) {
        this.fn = fn;
    }

    public CStudent(String name, int fn) {
        this.name = name;
        this.fn = fn;
        this.subjects = new String[10];
        this.scores = new double[10];
        this.scoreCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getFn() {
        return fn;
    }

    public double getGrade() {
        if (scoreCount == 0) return 0;
        double total = 0;
        for (int i = 0; i < scoreCount; i++) {
            total += scores[i];
        }
        return total / scoreCount;
    }

    public void addScore(String subject, double score) {
        for (int i = 0; i < scoreCount; i++) {
            if (subjects[i].equals(subject)) {
                scores[i] = score;
                return;
            }
        }
        if (scoreCount < subjects.length) {
            subjects[scoreCount] = subject;
            scores[scoreCount] = score;
            scoreCount++;
        } else {
            System.out.println("Не може да се добави повече предмети за " + name);
        }
    }

    public String getScores() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < scoreCount; i++) {
            result.append(subjects[i]).append(": ").append(scores[i]);
            if (i < scoreCount - 1) result.append(", ");
        }
        return result.toString();
    }
}
