import java.util.Arrays;

public class PerfectPower {
    public static void main(String[] args) {
        Arrays.stream(isPerfectPower(9)).forEach(System.out::println);
    }

    public static int[] isPerfectPower(int n) {
        for (int i = 1; i < n; i++) {
            if (isCompletelyDivisible(i, n)) {
                for (int j = 0; j <= n; j++) {
                    if (Math.pow(i, j) == n) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

    private static boolean isCompletelyDivisible(int i, int n) {
        return n % i == 0;
    }
}