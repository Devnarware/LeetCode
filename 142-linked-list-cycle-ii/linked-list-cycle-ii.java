/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null ;
        }
        boolean isCycle = false ;
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast){
                isCycle = true ;
                break ;
            }
        }

        if(isCycle){
            ListNode prev = head ;
            slow = head ;
            while(slow != fast){
                slow = slow.next ;
                fast = fast.next ;
                prev = fast ;
            }
            return prev ;
        }
        return null ;
    }
}