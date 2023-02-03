import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnoughIsEnoughTest {

    @Test
    void testCaseOne() {
        assertArrayEquals(new int[]{20, 37, 21}, EnoughIsEnough.deleteNth(new int[]{20, 37, 20, 21}, 1));
    }

    @Test
    void testCaseTwo() {
        assertArrayEquals(new int[]{1, 1, 3, 3, 7, 2, 2, 2}, EnoughIsEnough.deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3));
    }

    @Test
    void testCaseThree() {
        assertArrayEquals(new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5}, EnoughIsEnough.deleteNth(new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5}, 3));
    }

    @Test
    void testCaseFour() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, EnoughIsEnough.deleteNth(new int[]{1, 1, 1, 1, 1}, 5));
    }

    @Test
    void testCaseFive() {
        assertArrayEquals(new int[]{}, EnoughIsEnough.deleteNth(new int[]{}, 5));
    }


}