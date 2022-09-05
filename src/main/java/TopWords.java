
import java.util.*;
import java.util.stream.Collectors;

public class TopWords {

    public static void main(String[] args) {
        String test = "  //wont won't won't";
        System.out.println(top3(test));
//        System.out.println(removeExtraWhiteSpace("  //wont won't won't ").length());
    }

    public static List<String> top3(String s) {
        List<String> arrayOfWords = arrayOfWords(s);

        List<String> wordsWithoutSpecialCharacters = new ArrayList<>();

        for (String word : arrayOfWords) {
            wordsWithoutSpecialCharacters.add(stringWithoutSpecialCharacters(word));
        }
        var topStrings = topStrings(wordsWithoutSpecialCharacters, 3);

        return topStrings;
    }

    private static List<String> topStrings(List<String> list, int topNumber) {
        List<String> topItems = new ArrayList<>();

        var listInLowerCase = list.stream().map(String::toLowerCase).collect(Collectors.toList());

        for (String item : list) {
            int occurrences = Collections.frequency(listInLowerCase, item.toLowerCase());
            if (occurrences >= topNumber && !topItems.contains(item.toLowerCase())) {
                topItems.add(item.toLowerCase());
            }
        }

        return topItems;
    }

    private static String stringWithoutSpecialCharacters(String str) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String subString = str.substring(i, i + 1);
            if (!isSpecial(subString)) {
                builder.append(subString);
            }
        }
        return builder.toString();
    }

    private static boolean isSpecial(String c) {
        String[] specialCharacters = {"/", "\\", ".", "...", ",", "!", ":"};

        for (String specialCharacter : specialCharacters) {
            if (specialCharacter.equals(c)) {
                return true;
            }
        }

        return false;
    }

    private static List<String> arrayOfWords(String str) {
        String cleanString = removeExtraWhiteSpace(str);
        List<Integer> arrayListOfSpaceIndexes = new ArrayList<>();

        arrayListOfSpaceIndexes.add(0);

        for (int i = 0; i < cleanString.length(); i++) {
            if (cleanString.charAt(i) == ' ') {
                arrayListOfSpaceIndexes.add(i + 1);
            }
        }
        arrayListOfSpaceIndexes.add(cleanString.length());

        int[] arrayOfSpaceIndexes = arrayListOfSpaceIndexes.stream().mapToInt(i -> i).toArray();

        List<String> listOfStrings = new ArrayList<>();

        for (int i = 0; i < arrayOfSpaceIndexes.length - 1; i++) {
            String subString;

            if (arrayOfSpaceIndexes[i] != arrayOfSpaceIndexes[arrayOfSpaceIndexes.length - 2]) {
                subString = cleanString.substring(arrayOfSpaceIndexes[i], arrayOfSpaceIndexes[i + 1] - 1);
            } else {
                subString = cleanString.substring(arrayOfSpaceIndexes[i], arrayOfSpaceIndexes[i + 1]);
            }
            listOfStrings.add(subString);
        }

        return listOfStrings;
    }

    private static String removeExtraWhiteSpace(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i != str.length() - 1) {
                if (str.charAt(i) != ' ' || str.charAt(i + 1) != ' ') {
                    builder.append(str.charAt(i));
                }
            }
        }

        String clean = builder.toString();
        if (clean.charAt(0) == ' ') {
            return clean.substring(0);
        }

        return clean;
    }

}
