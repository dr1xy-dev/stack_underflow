public class ListNode {
    private String data;
    private ListNode next;

    public ListNode(String data) {
        this.data = data;
        next = null;
    }

    public String getValue() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode node) {
        next = node;
    }
}
