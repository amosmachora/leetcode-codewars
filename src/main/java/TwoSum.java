import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{3, 2, 4}, 6)).forEach(n -> System.out.println(n));
    }

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> myList = new ArrayList<>();
        Arrays.stream(nums).forEach(number -> myList.add(number));
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
