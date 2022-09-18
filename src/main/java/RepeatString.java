public class RepeatString {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= repeat; i++) {
            builder.append(string);
        }
        return "";
    }

    public static Double multiply(Double a, Double b) {
        var answer = a * b;
        return (Double) answer;
    }

}
