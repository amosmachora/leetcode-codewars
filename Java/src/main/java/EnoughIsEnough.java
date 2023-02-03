import java.util.ArrayList;
import java.util.List;

/**
 * Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
 * For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
 * With list [20,37,20,21] and number 1, the result would be [20,37,21].
 */


public class EnoughIsEnough {
    public static void main(String[] args) {
        deleteNth(new int[]{1, 2, 3, 1, 2, 1, 2, 3}, 2);
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> arrayOfNumbers = new ArrayList<>();

        for (int element : elements) {
            if (numberOfOccurrences(arrayOfNumbers, element) < maxOccurrences) {
                arrayOfNumbers.add(element);
            }
        }

        printOut(arrayOfNumbers);

        return arrayOfNumbers.stream().mapToInt(i -> i).toArray();
    }

    //Return the number of occurrences of an element
    private static int numberOfOccurrences(List<Integer> lisOfIntegers, int element) {
        return Math.toIntExact(lisOfIntegers.stream().filter(n -> n == element).count());
    }

    //Helper function to print it out
    private static void printOut(List<Integer> myList) {
        System.out.println(myList);
    }
}
