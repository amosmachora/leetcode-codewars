import java.util.HashMap;

public class RomanNumerals {

    public static void main(String[] args) {
        HashMap<String, Integer> table = new HashMap<>();
        table.put("I", 1);
        table.put("IV", 4);
        table.put("V", 5);
        table.put("X", 10);
        table.put("L", 50);
        table.put("C", 100);
        table.put("D", 500);
        table.put("M", 1000);

        System.out.println(toRoman(125));

    }

    public static String toRoman(int n) {
        StringBuilder builder = new StringBuilder();
        HashMap<String, Integer> table = new HashMap<>();
        table.put("I", 1);
        table.put("IV", 4);
        table.put("V", 5);
        table.put("X", 10);
        table.put("L", 50);
        table.put("C", 100);
        table.put("D", 500);
        table.put("M", 1000);


        for (var entry : table.entrySet()) {
            if (entry.getValue() < n) {
                builder.append(entry.getKey());
                n = n - entry.getValue();
            }
        }
        return builder.toString();
    }

    public static int fromRoman(String romanNumeral) {

        return 1;
    }
}
