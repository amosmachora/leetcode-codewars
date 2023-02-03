import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {

    @Test
    void lastDigit() {
        assertEquals(8, LastDigit.lastDigit(new BigInteger("2"), new BigInteger("7")));
        assertEquals(4, LastDigit.lastDigit(new BigInteger("4"), new BigInteger("1")));
        assertEquals(6, LastDigit.lastDigit(new BigInteger("4"), new BigInteger("2")));
        assertEquals(9, LastDigit.lastDigit(new BigInteger("9"), new BigInteger("7")));
    }
}