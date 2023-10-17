
import java.util.Scanner;

public class InfiniteNamePrinter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    System.out.print("Enter your name: ");
			    String name = scanner.nextLine();
			    System.out.println("Hello, " + name + "!");
			}
		}
    }
}
