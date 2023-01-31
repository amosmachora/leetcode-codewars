import java.awt.*;
import java.math.BigInteger;

public class HexToRGB {

    public static int[] hexStringToRGB(String hex) {
        var color = Color.decode(hex);
        return new int[]{color.getRed(), color.getGreen(), color.getBlue()};
    }

    public static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X", r, g, b);
    }

    public static String sumStrings(String a, String b) {
        BigInteger aBig = a == "" ? BigInteger.ZERO : new BigInteger(a);
        BigInteger bBig = a == "" ? BigInteger.ZERO : new BigInteger(b);

        return aBig.add(bBig).toString();
    }


    public static String getZeroPadded(String s) {
        if (s.length() == 2) {
            return s;
        }
        return "0" + s;
    }

}