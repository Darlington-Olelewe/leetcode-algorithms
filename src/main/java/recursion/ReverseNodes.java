package recursion;

public class ReverseNodes {
   private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;
        }
    }


    public ListNode reverseList(ListNode head) {

        return getFirst(head, null);
    }

    public ListNode getFirst(ListNode head, ListNode rest){
       if(head == null){
           return rest;
       }
        ListNode tail = head;
        ListNode others = tail.next;
        tail.next = null;

        if(rest == null){
            rest = tail;
        }else {
            tail.next = rest;
            rest = tail;
        }
        return  getFirst(others, rest);
    }


    public ListNode reverse(ListNode head){
       ListNode prev = null;
       ListNode curr = head;



       while(curr != null){
           // 9
           // 0 8 7 9 8 7 null

           ListNode tmep = curr.next; //7 9 8 7 null
           curr.next = prev; //8 0 9 null
           prev = curr; //8 0 9 null
           curr = tmep; //7 9 8 7 null


       }

       return prev;
    }
}
