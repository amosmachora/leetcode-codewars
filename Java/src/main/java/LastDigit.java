import java.math.BigDecimal;
import java.math.BigInteger;


public class LastDigit {
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        var power = n1.pow(n2.intValueExact());
        String powerInString = String.valueOf(power);

        for (int i = powerInString.length() - 1; i >= 0; i--) {
            if (powerInString.charAt(i) != '0' && powerInString.charAt(i) != '.') {
                try {
                    return Integer.parseInt(String.valueOf(powerInString.charAt(i)));
                } catch (NumberFormatException nfe) {
                    return 0;
                }
            }
        }
        try {
            return Integer.parseInt(String.valueOf(powerInString.charAt(powerInString.length() - 2)));
        } catch (NumberFormatException nfe) {
            return 0;
        }
    }
}
