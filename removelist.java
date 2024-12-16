public class removelist {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        public static removelist.ListNode insert(ListNode head, int val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                return newNode;
            }
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            return head;
        }

        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + "->");
                current = current.next;
            }
            System.out.println("null");
        }

        public static removelist.ListNode remove(ListNode head, int k) {

            // Create a dummy node that points to the head
            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            // Use a pointer to traverse the list
            ListNode current = dummy;

            while (current.next != null) {
                if (current.next.val == k) {
                    // Skip the node with the value
                    current.next = current.next.next;
                } else {
                    // Move to the next node
                    current = current.next;
                }
            }

            // Return the new head (skipping the dummy node)
            return dummy.next;

        }
    }

    public static void main(String[] args) {
        ListNode head = null;
        head = ListNode.insert(head, 10);
        head = ListNode.insert(head, 2);
        head = ListNode.insert(head, 7);
        head = ListNode.insert(head, 1);
        head = ListNode.insert(head, 94);
        head = ListNode.insert(head, 76);
        head = ListNode.insert(head, 6);
        ListNode.printList(head);
        head = ListNode.remove(head, 10);
        ListNode.printList(head);
    }

}
