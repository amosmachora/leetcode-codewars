public class StripComments {
    public static void main(String[] args) {
        var answer = stripComments("apples, pears # and bananas\\ngrapes\\nbananas !apples", new String[]{"#", "!"});
        System.out.println(answer);
    }

    public static String stripComments(String text, String[] commentSymbols) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder textAfterComment = new StringBuilder();

        text.strip();

        for (int i = 0; i < text.length(); i++) {
            if (isLastSymbol(commentSymbols, text.charAt(i))) {
                return cleaned(stringBuilder.toString(), textAfterComment.toString());
            }
            if (!isSymbol(commentSymbols, text.charAt(i))) {
                stringBuilder.append(text.charAt(i));
            } else {
                String s = text.substring(i, text.indexOf('\\'));
                textAfterComment.append(s);
            }
        }

        return cleaned(stringBuilder.toString(), textAfterComment.toString());
    }

    private static String cleaned(String main, String substring) {
        return main.replace(substring, "");
    }

    private static boolean isLastSymbol(String[] commentSymbols, char charAt) {
        return commentSymbols[commentSymbols.length - 1].charAt(0) == charAt;
    }

    private static boolean isSymbol(String[] commentSymbols, char charAt) {
        for (String symbol : commentSymbols) {
            if (symbol.charAt(0) == charAt) {
                return true;
            }
        }
        return false;
    }
}
