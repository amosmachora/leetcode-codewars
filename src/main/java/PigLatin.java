import java.util.ArrayList;
import java.util.List;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word.
 * Leave punctuation marks untouched.
 * <p>
 * Examples
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */
public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Hello world !"));
    }

    public static String pigIt(String str) {
        StringBuilder finalString = new StringBuilder();

        var words = arrayOfWords(str);

        for (int i = 0; i < words.length; i++) {
            StringBuilder builder = new StringBuilder();
            if (containsSpecialCharacters(words[i])) {
                builder.append(words[i]);
            } else {
                if (i != words.length - 1) {
                    builder.append(words[i].substring(1)).append(words[i].charAt(0)).append("ay").append(' ');
                } else {
                    builder.append(words[i].substring(1)).append(words[i].charAt(0)).append("ay");
                }
            }

            finalString.append(builder);
        }

        return finalString.toString();
    }

    private static String[] arrayOfWords(String str) {
        List<Integer> arrayListOfSpaceIndexes = new ArrayList<>();
        arrayListOfSpaceIndexes.add(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                arrayListOfSpaceIndexes.add(i + 1);
            }
        }
        arrayListOfSpaceIndexes.add(str.length());

        int[] arrayOfSpaceIndexes = arrayListOfSpaceIndexes.stream().mapToInt(i -> i).toArray();

        List<String> listOfStrings = new ArrayList<>();

        for (int i = 0; i < arrayOfSpaceIndexes.length - 1; i++) {
            String subString;

            if (arrayOfSpaceIndexes[i] != arrayOfSpaceIndexes[arrayOfSpaceIndexes.length - 2]) {
                subString = str.substring(arrayOfSpaceIndexes[i], arrayOfSpaceIndexes[i + 1] - 1);
            } else {
                subString = str.substring(arrayOfSpaceIndexes[i], arrayOfSpaceIndexes[i + 1]);
            }
            listOfStrings.add(subString);
        }

        String[] words = listOfStrings.toArray(new String[0]);

        return words;
    }

    private static boolean containsSpecialCharacters(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i)) == false && Character.isLetter(word.charAt(i)) == false) {
                return true;
            }
        }
        return false;
    }

}
