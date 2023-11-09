
import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] inputArray1 = {-1, 2, -1, 3, 0};
        int result1 = findFirstNonRepeatingElement(inputArray1);
        System.out.println("Output 1: " + result1);

        int[] inputArray2 = {9, 4, 9, 6, 7, 4};
        int result2 = findFirstNonRepeatingElement(inputArray2);
        System.out.println("Output 2: " + result2);
    }

    static int findFirstNonRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : arr) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            if (frequencyMap.get(i) == 1) {
                return i; 
            }
        }

        return -1;
    }
}
