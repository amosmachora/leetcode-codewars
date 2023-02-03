import java.util.*;

public class PickPeaks {
    public static void main(String[] args) {
//        System.out.println(getListOfPlateauIndexes(new int[]{2, 1, 3, 1, 2, 2, 2, 2}, 2));
        //3,2,3,6,4,1,2,3,2,1,2,2,2,1
        //15, 10, 11, 11, -1, 14, 8, 18, 12, -2, 6, -1, 19, 1, 11, 6, 1, -4, 10, 19
        //get first occurrence of item and last occurrence
        long yourInteger = 12345678910L;
        StringBuilder stringBuilder = new StringBuilder();
        String s = Long.toString(yourInteger);

        for (int i = 0; i < s.length(); i = i + 3) {
            if (s.length() - i > 3) {
                String subString = s.substring(i, i + 3);
                stringBuilder.append(subString);
                stringBuilder.append("-");
            }
        }

        stringBuilder.append(s.substring(s.length() - 2));

        System.out.println(stringBuilder.toString());

    }

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        HashMap<String, List<Integer>> stringListHashMap = new HashMap<>();
        List<Integer> positions = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        List<Integer> checked = new ArrayList<>();

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                positions.add(i);
                values.add(arr[i]);
            }
            if (arr[i] == arr[i + 1] && !checked.contains(arr[i])) {
                checked.add(arr[i]);
                var listOfIndexes = getListOfPlateauIndexes(arr, arr[i]);
                var lastPlateauIndex = listOfIndexes.get(listOfIndexes.size() - 1) + 1;
                if (arr[lastPlateauIndex] > arr[lastPlateauIndex + 1]) {
                    if (!positions.contains(listOfIndexes.get(0))) {
                        positions.add(listOfIndexes.get(0));
                        values.add(arr[listOfIndexes.get(0)]);
                    }
                }
            }
        }

        stringListHashMap.put("pos", positions);
        stringListHashMap.put("peaks", values);


        return stringListHashMap;
    }

    private static List<Integer> getListOfPlateauIndexes(int[] array, int value) {
//        2, 1, 3, 1, 2, 2, 2, 2
        List<Integer> allItemsList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            allItemsList.add(array[i]);
        }
        List<Integer> integerList = new ArrayList<>();
        integerList.add(allItemsList.indexOf(value));
        return integerList;
    }
}
