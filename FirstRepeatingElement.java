
import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] inputArray1 = {10, 5, 3, 4, 3, 5, 6};
        int result1 = findFirstRepeatingElement(inputArray1);
        System.out.println("Output 1: " + result1);

        int[] inputArray2 = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int result2 = findFirstRepeatingElement(inputArray2);
        System.out.println("Output 2: " + result2);
    }

    static int findFirstRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            if (indexMap.containsKey(currentElement)) {
                minIndex = Math.min(minIndex, indexMap.get(currentElement));
            } else {
                indexMap.put(currentElement, i);
            }
        }
        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex;
    }
}
