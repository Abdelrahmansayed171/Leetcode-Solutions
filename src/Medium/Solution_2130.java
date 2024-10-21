package Medium;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

public class Solution_2130 {
    public int pairSum(ListNode head) {
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
    }
}
