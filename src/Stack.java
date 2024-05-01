public class Stack {

    private ListNode head; // beginning of the stack

    private ListNode topNode;

    private int capacity;

    private int items;

    public Stack() {
        head = null;
        topNode = head;
        items = 0;
    }

    public boolean isEmpty() {
        if (topNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (items >= capacity) {
            return true;
        } else {
            return false;
        }
    }
    public boolean push(String s) {
        // start at the head

        if (items + 1 > capacity) {
            return false;
        }

        if (head == null) {
            // if head is null then create the first node
            head = new ListNode(s);
            topNode = head;

            items++;
            return true;
        } else {
            // current node
            ListNode current = head;

            while (current.getNext() != null) {
                current = current.getNext();
            }

            ListNode node = new ListNode(s);

            current.setNext(node);

            topNode = node;
            items++;
            return true;
        }
    }

    public void pop() {
        // move along the nodes
        ListNode prevNode = null;
        ListNode current = head;
        ListNode aboveNode = null;

        while (current != topNode && current.getNext() != null) {
            prevNode = current;
            current = current.getNext();
            aboveNode = current.getNext();
        }

        // delete the node
        prevNode.setNext(aboveNode);
    }

    public void peek() {
        // move along the nodes
        // start at the head
        ListNode current = head;

        while (current != topNode && current.getNext() != null) {
            current = current.getNext();
        }

        System.out.println(current.getValue());
    }

    public int size() {
        return items;
    }
}
