package Easy;

import Medium.ListNode;

public class Solution_206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            if(next == null)
                break;
            head = next;
        }
        return head;
    }
}
