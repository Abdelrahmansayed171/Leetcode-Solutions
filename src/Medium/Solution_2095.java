package Medium;

// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75
// Delete the Middle Node of a Linked List.

public class Solution_2095 {
    /*public Medium.ListNode deleteMiddle(Medium.ListNode head) {
        if(head == null || head.next == null)
            return null;
        int size = 0;
        Medium.ListNode tmp = head;
        while ( tmp != null ) {
            size++;
            tmp = tmp.next;
        }
        int mid = size/2 -1;
        int cnt = 0;
        tmp = head;
        while (true){
            System.out.println(cnt + " : " + tmp.val);
            if(cnt == mid){
                tmp.next = tmp.next.next;
                break;
            }
            else{
                tmp = tmp.next;
                cnt++;
            }
        }
        return head;
    }*/
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null||head==null)
            return null;
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
