public class CarMileage {
    /**
     * Any digit followed by all zeros: 100, 90000
     * Every digit is the same number: 1111
     * The digits are sequential, incrementing: 1234
     * The digits are sequential, decrementing : 4321
     * The digits are a palindrome: 1221 or 73837
     * The digits match one of the values in the awesomePhrases array
     * For incrementing sequences, 0 should come after 9, and not before 1, as in 7890.
     * For decrementing sequences, 0 should come after 1, and not before 9, as in 3210.
     */

    public static int isInteresting(int number, int awesomePhrases[]) {
        if (number <= 99) {
            return 0;
        }
        if (isFollowedByAllZeros(number) || isEveryDigitTheSame(number) || (areDigitsIncrementing(number)) || areDigitsDecrementing(number) || isPalindrome(number) || arrayContainsValue(number, awesomePhrases)) {
            return 2;
        } else if (interestingNumbersOccursInTwoMiles(number, awesomePhrases)) {
            return 1;
        }
        return 0;
    }

    private static boolean interestingNumbersOccursInTwoMiles(int number, int[] awesomePhrases) {
        int nextMile = number + 1;
        int nextTwoMiles = number + 2;

        if (interestingInOneOrTwo(nextMile, awesomePhrases) || interestingInOneOrTwo(nextTwoMiles, awesomePhrases)) {
            return true;
        }

        return false;
    }

    private static boolean interestingInOneOrTwo(int nextMiles, int[] awesomePhrases) {
        if (areDigitsDecrementing(nextMiles) || arrayContainsValue(nextMiles, awesomePhrases) || isPalindrome(nextMiles) || areDigitsIncrementing(nextMiles) || areDigitsDecrementing(nextMiles) || isEveryDigitTheSame(nextMiles) || isFollowedByAllZeros(nextMiles)) {
            return true;
        }
        return false;
    }

    private static boolean areDigitsDecrementing(int number) {
        String checker = "9876543210";
        if (checker.contains(String.valueOf(number))) {
            return true;
        }
        return false;
    }

    private static boolean arrayContainsValue(int number, int[] awesomePhrases) {
        for (int testCase : awesomePhrases) {
            if (testCase == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(int number) {
        String str = String.valueOf(number).toLowerCase();
        StringBuilder reversedBuilder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedBuilder.append(str.charAt(i));
        }

        String reversed = reversedBuilder.toString();

        if (str.equals(reversed)) {
            return true;
        }

        return false;
    }

    private static boolean areDigitsIncrementing(int number) {
        String checker = "01234567890";
        if (checker.contains(String.valueOf(number))) {
            return true;
        }
        return false;
    }

    private static boolean isEveryDigitTheSame(int number) {
        String str = String.valueOf(number);
        boolean isSame = false;
        for (int i = 0; i < str.length(); i++) {
            if (i != str.length() - 1) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    isSame = true;
                } else {
                    isSame = false;
                    return isSame;
                }
            }

        }
        return isSame;
    }

    private static boolean isFollowedByAllZeros(int number) {
        String numberWithoutFirstLetter = String.valueOf(number).substring(1);

        if (Integer.valueOf(numberWithoutFirstLetter) == 0) {
            return true;
        }

        return false;
    }
}

