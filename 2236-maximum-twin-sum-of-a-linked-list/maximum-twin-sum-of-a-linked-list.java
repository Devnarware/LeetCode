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
    public int pairSum(ListNode head) {
        
        // STEP 1:- find the mid

        ListNode slow = head ;
        ListNode fast = head ;

        while(fast != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }


        //STEP 2:- reverse form the mid part
        ListNode head2 = reverse(slow) ;

        // STEP 3 :- final check to fins the max sum
        int sum = 0 ;

        while(head2 != null){
            int currSum = head.val + head2.val ;
            sum = Math.max(currSum, sum) ;

            head2 = head2.next ;
            head = head.next ;
        }

        return sum ;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null ;
        ListNode curr ;

        while(head != null){
            curr = head ;
            head = head.next ;
            curr.next = prev ;
            prev = curr ;
        }

        return prev ;
    }
}