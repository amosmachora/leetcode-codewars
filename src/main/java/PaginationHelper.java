import java.util.List;

/**
 * For this exercise you will be strengthening your page-fu mastery. You will complete the PaginationHelper class, which is a utility class helpful for querying paging information related to an array.
 * <p>
 * The class is designed to take in an array of values and an integer indicating how many items will be allowed per each page. The types of values contained within the collection/array are not relevant.
 * <p>
 * The following are some examples of how this class is used:
 * <p>
 * PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
 * helper.pageCount(); //should == 2
 * helper.itemCount(); //should == 6
 * helper.pageItemCount(0); //should == 4
 * helper.pageItemCount(1); // last page - should == 2
 * helper.pageItemCount(2); // should == -1 since the page is invalid
 * <p>
 * // pageIndex takes an item index and returns the page that it belongs on
 * helper.pageIndex(5); //should == 1 (zero based index)
 * helper.pageIndex(2); //should == 0
 * helper.pageIndex(20); //should == -1
 * helper.pageIndex(-10); //should == -1
 */
public class PaginationHelper<I> {
    private List<I> collection;
    private int itemsPerPage;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;

    }

    public int itemCount() {
        return collection.size();
    }

    public int pageCount() {
        if (collection.size() == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < collection.size(); i++) {
            if (i % itemsPerPage == 0 && i >= itemsPerPage) {
                count++;
            }
        }
        return count + 1;
    }

    public int pageItemCount(int pageIndex) {
        if (pageIndex >= pageCount()) {
            return -1;
        }
        if (pageIndex == pageCount() - 1) {
            return collection.size() % itemsPerPage;
        }
        return itemsPerPage;
    }

    public int pageIndex(int itemIndex) {
        if (itemIndex > collection.size() || itemIndex < 0 || collection.size() == 0) {
            return -1;
        }

        int page = 0;
        for (int i = 0; i < itemIndex; i++) {
            if (i % itemsPerPage == 0 && i >= itemsPerPage) {
                page++;
            }
        }

        return page;
    }
}