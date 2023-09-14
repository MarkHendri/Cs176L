
public class Student {
    private String name;
    private int totalScore;
    private int numQuizzes;

    public Student(String name) {
        this.name = name;
        this.totalScore = 0;
        this.numQuizzes = 0;
    }

    public String getname() {
        return name;
    }

    public void addQuiz(int score) {
        totalScore += score;
        numQuizzes++;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public double getAverageScore() {
        if (numQuizzes == 0) {
            return 0.0;
        }
        return (double) totalScore / numQuizzes;
    }

    public static void main(String[] args) {
        Student myStudent = new Student("Mark Hendri");

        int[] quizScores = {50, 57, 67, 77, 99};
        for (int score : quizScores) {
            myStudent.addQuiz(score);
        }

        System.out.println("Name: " + myStudent.getname());
        System.out.println("Total Score: " + myStudent.getTotalScore());
        System.out.println("Average Score: " + myStudent.getAverageScore());
    }
}

