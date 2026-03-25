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

        // STEP 1:- BREAK FROM THE MIDDLE 

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // STEP 2:- reverse the second half od the LL

        ListNode rightHead = reverse (slow) ;


        // Step 3:- Compare for a palindrome 

        ListNode temp = head ;
        ListNode temp2 = rightHead ;
        while(temp2 != null){
            if(temp.val != temp2.val){
                return false ;
            }
            temp = temp.next ;
            temp2 = temp2.next ;
        }

        return true ;
    }

    private ListNode reverse(ListNode head){
        ListNode temp = head ;
        ListNode last = null ;

        while(head != null){
            temp = head ;
            head = head.next ;
            temp.next = last ;
            last = temp ;
        }

        return temp ;
    }


}