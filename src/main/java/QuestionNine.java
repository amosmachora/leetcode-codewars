import java.time.Instant;

public class QuestionNine {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.print(instant);
    }

    //Non-recursive method
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // recursive java method
    public String reverseStringRecursively(String s) {
        if (s.length() == 0) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

}
