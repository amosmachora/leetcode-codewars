public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
    }

    public boolean isPalindrome(ListNode head) {
        //1, 2 ,2 ,1
        return false;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}