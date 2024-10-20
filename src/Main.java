import Easy.Solution_724;
import Medium.*;


public class Main {
    public static void main(String[] args) {
        Solution_328 solution2352 = new Solution_328();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        ListNode ans = solution2352.oddEvenList(head);
        while (ans != null){
            System.out.print(ans.val);
            ans = ans.next;
        }
//        System.out.println(solution2352.oddEvenList(head));
/*        for (int i : solution2352.asteroidCollision(arr)) {
            System.out.println(i+ " ");
        }*/
    }
}