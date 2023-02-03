public class FindOdd {
    public static int findIt(int[] a) {
        for (int number : a) {
            if (getNumberOfOccurrences(number, a) % 2 != 0) {
                return number;
            }
        }
        return 0;
    }

    private static int getNumberOfOccurrences(int number, int[] a) {
        int numberOfOccurrences = 0;
        for (int test : a) {
            if (test == number) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }
}