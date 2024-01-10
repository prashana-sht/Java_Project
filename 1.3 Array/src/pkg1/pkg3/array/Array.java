package pkg1.pkg3.array;
public class Array {
    public static void main(String[] args) {
        int[] array = { 10, 5, 18, 30, 9, 15, 7 };

        int smallest = findSmallestElement(array);
        int largest = findLargestElement(array);
        int sum = calculateSum(array);

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Smallest Element: " + smallest);
        System.out.println("Largest Element: " + largest);
        System.out.println("Sum of Elements: " + sum);
    }
    private static int findSmallestElement(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    private static int findLargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}
