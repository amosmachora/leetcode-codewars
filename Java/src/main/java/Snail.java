import java.util.ArrayList;
import java.util.List;

//Code-wars :https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java
public class Snail {
    public static void main(String[] args) {
        var oneDArray = snail(new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}});
        System.out.println(oneDArray.length);
    }

    public static int[] snail(int[][] array) {
        if (array.length == 0) {
            return new int[]{};
        }

        List<Integer> myArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                myArray.add(array[i][j]);
            }
        }

        return myArray.stream().mapToInt(i -> i).toArray();
    }
}
