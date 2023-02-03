public class QuestionNine {
    public static void main(String[] args) {
        long start = System.nanoTime();
        reverseStringRecursively(getString(100));
        long end = System.nanoTime();
        System.out.print((end - start) / 1e9);
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
    public static String reverseStringRecursively(String s) {
        if (s.length() == 0) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static String getString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("x");
        }
        return stringBuilder.toString();
    }

}
