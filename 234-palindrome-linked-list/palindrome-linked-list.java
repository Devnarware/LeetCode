/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head ;
        ListNode fast = head ;

        //FINDING MID
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
       
        //REVERSE THE RIGHT PART OF THER NODE

        ListNode right = reverse(slow) ;


        //CHECKING IF PALINDROME OR NOT

        while(right != null){
            if(head.val != right.val){
                return false ;
            }
            right = right.next ;
            head = head.next ;
        } 
        return true ;
    }

    public static ListNode reverse(ListNode head){
        ListNode node = null ;
        while(head != null){
            ListNode temp = head.next ;
            head.next = node ;
            node = head ;
            head = temp ;
        }
        return node ;
    }
}