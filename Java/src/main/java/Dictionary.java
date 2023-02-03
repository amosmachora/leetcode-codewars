import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dictionary {

    private final String[] words;

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
        System.out.println(dictionary.findMostSimilar("berry"));
    }

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        List<String> myList = new ArrayList<>();
        Arrays.stream(words).forEach(word -> myList.add(word));

        if (myList.contains(to))
            return to;

        String foundWord = "tez";
        int currentDifference = 0;
        for (int i = 0; i < words.length; i++) {
            if (getDifference(words[0], to) < currentDifference) {
                if (words[0].contains(to)) {
                    return words[0];
                }
                currentDifference = getDifference(words[0], to);
                foundWord = words[i];
                System.out.println(words[i]);
            }
        }
        return foundWord;
    }

    private int getDifference(String word, String to) {
        //Cherry
        //cher
        int diff = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < to.length(); j++) {
                if (word.charAt(i) != to.charAt(j))
                    diff++;
            }
        }
        return 0;
    }
}