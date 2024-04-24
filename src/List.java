public class List {
    private ListNode head;

    public List(int[] values) {
        ListNode n = new ListNode(values[0]);
        head = n;

        for (int i = 1; i < values.length; i++) {
            n.next = new ListNode(values[0]);
            n = n.next;
        }
    }

    public ListNode getHead() {
        return head;
    }

}
