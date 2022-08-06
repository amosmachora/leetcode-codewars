import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDifference {
    public static void main(String[] args) {
        Arrays.stream(arrayDiff(new int[]{1, 2, 2}, new int[]{})).forEach(System.out::println);
    }

    public static int[] arrayDiff(int a[], int b[]) {

        List<Integer> arrayOfDifferences = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int finalI = a[i];
            boolean test = Arrays.stream(b).anyMatch(x -> x == finalI);
            if (!test) {
                arrayOfDifferences.add(a[i]);
            }
        }
        return arrayOfDifferences.stream().mapToInt(i -> i).toArray();
    }
}
