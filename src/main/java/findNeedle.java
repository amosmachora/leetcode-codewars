import java.util.Arrays;

public class findNeedle {
    public static String findNeedle(Object[] haystack) {
        // Your code here
        return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
    }
}
