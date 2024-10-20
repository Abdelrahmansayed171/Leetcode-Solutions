package Medium;

import java.util.List;

public class Solution_328 {
/*    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode tmp = head.next;
        ListNode last = null;
        while (odd != null ){

            if(odd.next.next != null){
                odd.next = odd.next.next;
                if(tmp.next.next != null){
                    tmp.next = tmp.next.next;
                }
                else{
                    tmp.next = null;
                }
            }
            last = odd.next;
            odd = odd.next;
        }
        last.next = tmp;
        return last;
    }*/

    public ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode tmp = head.next;
        while (odd != null && odd.next != null){
            if(odd.next.next == null && tmp.next == null){
                odd.next = even;
                return head;
            }
            odd.next = odd.next.next;
            if(tmp.next != null){
                tmp.next = tmp.next.next;
                tmp = tmp.next;
            }
            odd = odd.next;
        }
        odd.next = even;
        return head;
    }

}
