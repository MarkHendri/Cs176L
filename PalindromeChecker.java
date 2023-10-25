
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a word: ");
			String word = scanner.nextLine().toLowerCase();

			if (isPalindrome(word)) {
			    System.out.println("Yes, it is a palindrome.");
			} else {
			    System.out.println("No, it is not a palindrome.");
			}
		}
    }

    public static boolean isPalindrome(String word) {
        word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabet characters
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
