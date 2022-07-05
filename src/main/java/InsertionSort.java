import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Before:");
        printArray(numbers);

        insertionSort(numbers);
        System.out.println("After:");
        printArray(numbers);
    }

    private static void insertionSort(int[] arrayToBeSorted) {
        for (int i = 1; i < arrayToBeSorted.length; i++) {
            int currentValue = arrayToBeSorted[i];
            int j = i - 1;
            while (j >= 0 && arrayToBeSorted[j] > currentValue) {
                arrayToBeSorted[j + 1] = arrayToBeSorted[j];
                j--;
            }
            arrayToBeSorted[j + 1] = currentValue;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }


}
