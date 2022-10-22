/**
 * https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/solutions/java
 * List Filtering -> 7KYU
 */

import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(x -> x instanceof Integer).collect(Collectors.toList());
    }
}

