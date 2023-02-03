import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StripCommentsTest {

    @Test
    public void test1() {
        assertEquals("apples, pears\\ngrapes\\nbananas", StripComments.stripComments("apples, pears # and bananas\\ngrapes\\nbananas !apples", new String[]{"#", "!"}));
    }

    @Test
    public void test2() {
        assertEquals("a\\nc\\nd", StripComments.stripComments("a #b\\nc\\nd $e f g", new String[]{"#", "$"}));
    }

}
