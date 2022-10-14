package recursion;

public class SwapNodeHeads {
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;
        }
    }


    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode nextTwoNodes = head.next.next;

        ListNode current = head.next;
        ListNode next = head;

        head = current;
        current.next = next;
        next.next = swapPairs(nextTwoNodes);
        return head;
    }


}

