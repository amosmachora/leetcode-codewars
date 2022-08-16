import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        PaginationHelper<Character> paginationHelper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println(paginationHelper.pageIndex(2));
    }
}
