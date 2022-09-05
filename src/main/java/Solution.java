import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
//        System.out.println(calPoints(new String[]{"5", "7", "C", "D", "+"}));
    }

    public static int calPoints(String[] ops) {
        int result = Integer.MIN_VALUE;
        List<String> myList = new ArrayList<>();
        for (String op : ops) {
            if (isNumber(op)) {
                myList.add(op);
            } else if (op == "C") {
                myList.remove(myList.size() - 1);
            } else if (op == "D") {
                int newNumber = 2 * Integer.valueOf(myList.get(myList.size() - 1));
                myList.add(String.valueOf(newNumber));
            } else if (op == "+") {
                int newNumber = Integer.valueOf(myList.get(myList.size() - 1)) + Integer.valueOf(myList.get(myList.size() - 2));
                myList.add(String.valueOf(newNumber));
            }
        }

        for (String value : myList) {
            result = result + Integer.valueOf(value);
        }
        return result;
    }

    private static boolean isNumber(String x) {
        try {
            Integer.parseInt(x);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}