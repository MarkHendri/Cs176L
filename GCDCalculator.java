import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the first positive number: ");
			int num1 = scanner.nextInt();
			System.out.print("Enter the second positive number: ");
			int num2 = scanner.nextInt();

			if (num1 >= 0 && num2 >= 0 && num1 <= 1000 && num2 <= 1000) {
			    int gcd = calculateGCD(num1, num2);
			    System.out.println("GCD(" + num1 + ", " + num2 + ") = " + gcd);
			} else {
			    System.out.println("Input numbers must be in the range [0, 1000].");
			}
		}
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

