package Medium;

// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75
// Delete the Middle Node of a Linked List.

public class Solution_2095 {
    /*public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        int size = 0;
        ListNode tmp = head;
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

    }
}
