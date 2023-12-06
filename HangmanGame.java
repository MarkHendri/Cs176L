import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = {"banana", "apple", "orange", "grape", "cherry","bread"};
    private static final int MAX_INCORRECT_GUESSES = 6;

    private String secretWord;
    private char[] guessedWord;
    private int incorrectGuesses;
    private StringBuilder guessedLetters;

    public HangmanGame() {
        secretWord = chooseRandomWord();
        guessedWord = new char[secretWord.length()];
        guessedLetters = new StringBuilder();
        incorrectGuesses = 0;

        for (int i = 0; i < secretWord.length(); i++) {
            guessedWord[i] = '_';
        }
    }

    private String chooseRandomWord() {
        int randomIndex = (int) (Math.random() * WORDS.length);
        return WORDS[randomIndex];
    }

    public void play() {
        try (Scanner scanner = new Scanner(System.in)) {
			while (incorrectGuesses < MAX_INCORRECT_GUESSES) {
			    displayGameState();

			    System.out.print("Enter a letter: ");
			    char guess = scanner.next().charAt(0);

			    if (alreadyGuessed(guess)) {
			        System.out.println("You already guessed that letter. Try again.");
			        continue;
			    }

			    guessedLetters.append(guess);

			    if (checkGuess(guess)) {
			        System.out.println("Good guess!");
			    } else {
			        System.out.println("Incorrect guess.");
			        incorrectGuesses++;
			    }

			    if (isWordGuessed()) {
			        displayGameState();
			        System.out.println("Congratulations! You guessed the word: " + secretWord);
			        return;
			    }
			}
		}

        System.out.println("Sorry, you ran out of attempts. The correct word was: " + secretWord);
    }

    private boolean alreadyGuessed(char guess) {
        return guessedLetters.toString().contains(String.valueOf(guess));
    }

    private boolean checkGuess(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess) {
                guessedWord[i] = guess;
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    private void displayGameState() {
        System.out.println("Currently, times you guessed wrongly: " + incorrectGuesses);
        System.out.print("The hangman has: ");
        for (int i = 0; i < incorrectGuesses; i++) {
            System.out.print("X ");
        }
        System.out.println();

        System.out.print("You already guessed the letters: ");
        System.out.println(guessedLetters);

        System.out.print("The guessing word is: ");
        for (char c : guessedWord) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Hint: " + getHint());
    }

    private String getHint() {
        if (secretWord.equals("banana")) {
            return "fruit";
        } else if (secretWord.equals("apple")) {
            return "fruit";
        } else if (secretWord.equals("orange")) {
            return "fruit";
        } else if (secretWord.equals("grape")) {
            return "fruit";
        } else if (secretWord.equals("cherry")) {
            return "fruit";
        } else {
            return "unknown";
        }
    }

    private boolean isWordGuessed() {
        for (char c : guessedWord) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        hangmanGame.play();
    }
}
