import java.util.ArrayList;
import java.util.List;

public class Thirteen {
    public static void main(String[] args) {
        System.out.println(thirt(85299258));
//        System.out.println(Math.pow(10, 8) % 13);//1 10 9 12 3 4 1 10 9
//                                                 //8  5 2  9 9 2 5 8
    }

    public static long thirt(long n) {
        int[] pattern = {1, 10, 9, 12, 3, 4, 1};
        //85299258
        StringBuilder original = new StringBuilder(String.valueOf(n));
        List<Integer> integerList = new ArrayList<>();

        String checking = original.toString();
        System.out.println(reversed(checking));

        for (int i = 0; i < pattern.length; i++) {
           int temp = calculateTotal(reversed(checking),pattern);
           if(integerList.contains(temp)){
               return (long) temp;
           }
           integerList.add(temp);
           checking = String.valueOf(temp);
        }

        return n;
    }

    private static int calculateTotal(String reversed, int[] pattern) {
        int total = 0;

        for (int i = 0; i < reversed.length(); i++) {
            var x = Integer.parseInt(String.valueOf(reversed.charAt(i)));
            if(i >= pattern.length){
                total = total + (x * pattern[i - pattern.length + 1]);
            }else {
                total = total +  (x * pattern[i]);
            }
        }
        return total;
    }

    private static String reversed(String number) {
        StringBuilder original = new StringBuilder(String.valueOf(number));
        return original.reverse().toString();
    }


}
