
public class StringManipulation {
    public static String removeSpaces(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static String removeCharacter(String input, char target) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != target) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello world";
        char targetChar = 'o';

        String withoutSpaces = removeSpaces(input);
        System.out.println("String without spaces: " + withoutSpaces);

        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);

        String withoutTargetChar = removeCharacter(input, targetChar);
        System.out.println("String with '" + targetChar + "' removed: " + withoutTargetChar);
    }
}

