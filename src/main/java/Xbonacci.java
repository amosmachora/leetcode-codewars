import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Fibonnacci but on drugs.
public class Xbonacci {

    public static void main(String[] args) {
        Xbonacci xbonacci = new Xbonacci();
        double[] signature = {0.0, 1.0, 1.0};
        var answer = xbonacci.tribonnacci(signature, 7);
        Arrays.stream(answer).forEach(number -> System.out.println(number));

    }

    public double[] tribonnacci(double[] s, int n) {
        if (n == 0) {
            double[] myArray = new double[n];
            return myArray;
        }
        if (n < 3) {
            double[] myArray = new double[n];
            for (int i = 0; i < n; i++) {
                myArray[i] = s[i];
            }
            return myArray;
        }

        List<Double> myList = new ArrayList<>();
        Arrays.stream(s).forEach(number -> myList.add(number));

        for (int i = 0; i < n - 3; i++) {
            double sum = 0;
            for (int j = myList.size() - 3; j < myList.size(); j++) {
                sum += myList.get(j);
            }
            myList.add(sum);
        }

        double[] myArray = new double[myList.size()];
        for (int i = 0; i < myList.size(); i++) {
            myArray[i] = myList.get(i);
        }
        return myArray;
    }

}
