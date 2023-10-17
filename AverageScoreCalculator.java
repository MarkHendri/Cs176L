
import java.util.Scanner;

public class AverageScoreCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("What is your name? ");
			String name = scanner.nextLine();

			System.out.print("Hello " + name + ", how many exams have you taken? ");
			int numExams = scanner.nextInt();

			double totalScore = 0.0;
			int validScoresCount = 0;

			for (int i = 1; i <= numExams; i++) {
			    System.out.print("Give me the score of exam " + i + ": ");
			    int score = scanner.nextInt();

			    while (score < 0 || score > 100) {
			        System.out.print("Invalid score! Please give me the score of exam " + i + ": ");
			        score = scanner.nextInt();
			    }

			    totalScore += score;
			    validScoresCount++;
			}

			double averageScore = totalScore / validScoresCount;

			System.out.println("Hi, " + name + ", your average score of " + numExams + " exams is " + averageScore);
		}
    }
}
