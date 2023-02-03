public class SecureTester {
    public static void main(String[] args) {
        System.out.println(alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }

    public static boolean alphanumeric(String s) {
        if (s.length() == 0) {
            return false;
        }
        return areAllCharsLatinAndDigits(s) && hasNoWhiteSpace(s);
    }

    private static boolean hasNoWhiteSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                return false;
            }
        }

        return true;
    }

    private static boolean areAllCharsLatinAndDigits(String s) {
        boolean answer = false;
        for (int i = 0; i < s.length(); i++) {
            var value = String.valueOf(s.charAt(i));
            if (isNumber(value) || isUppercaseLetter(value) || isLowerCaseLetter(value)) {
                answer = true;
            } else {
                return false;
            }
        }
        return answer;
    }

    private static boolean isLowerCaseLetter(String value) {
        String latinCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return latinCharacters.toLowerCase().contains(value);
    }

    private static boolean isUppercaseLetter(String value) {
        String latinCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return latinCharacters.contains(value);
    }

    private static boolean isNumber(String value) {
        return "0123456789".contains(value);
    }

}