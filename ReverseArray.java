public class ReverseArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3};

        System.out.print("Input array: ");
        printArray(inputArray);

        reverseArray(inputArray);

        System.out.print("Reversed array: ");
        printArray(inputArray);
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

