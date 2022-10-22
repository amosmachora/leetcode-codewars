import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Turing {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        boolean result = false;
        List<Character> myList = new ArrayList<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            myList.add(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            var correspondingClosingTag = map.get(s.charAt(i));
            System.out.println(correspondingClosingTag + " " + s.charAt(i));
            if (myList.contains(correspondingClosingTag)) {
                result = true;
            } else {
                return false;
            }
        }

        return result;
    }

}
