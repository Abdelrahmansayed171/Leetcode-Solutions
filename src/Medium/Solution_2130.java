package Medium;

public class Solution_2130 {
/*    public int pairSum(Medium.ListNode head) {
        int sum = -10;
        Deque<Integer> deque = new LinkedList<>();
        while (head != null){
            deque.add(head.val);
            head = head.next;
        }
        while(!deque.isEmpty()){
            int first = deque.peekFirst();
            int last = deque.peekLast();
            if(first + last > sum)
                sum = deque.peekFirst() + deque.peekLast();
            deque.pollFirst();
            deque.pollLast();
        }
        return sum;
    }*/

    public int pairSum(ListNode head){
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        int sum = -10;
        while (prev!= null){
            sum = Math.max(sum, prev.val + slow.val);
            prev = prev.next;
            slow = slow.next;
        }
        return sum;
    }
}
