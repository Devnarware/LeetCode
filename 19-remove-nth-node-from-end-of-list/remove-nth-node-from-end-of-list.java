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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null || head.next == null ){
            head = null ;
            return head ;
        }
        ListNode temp = head ;
        int len = 0 ;
        int count = 0 ;
        while(temp.next != null){
            temp = temp.next ;
            len++ ;
        }

        if(len-n < 0){
            head = head.next ;
            return head ;
        }

        temp = head ;
        while(count < len - n){
            temp = temp.next ;
            count++ ;
        }

        temp.next = temp.next.next ;
        return head ;
    }
}