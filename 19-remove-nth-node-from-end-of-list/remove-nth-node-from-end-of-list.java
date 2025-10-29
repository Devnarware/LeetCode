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
        if(head == null || head.next == null){
            return null ;
        }
        ListNode temp = head ;
        int size = 0 ;
        while(temp.next != null){
            size++ ;
            temp = temp.next ;
        }
        if(size-n < 0){
            head = head.next ;
            return head ;
        }
        temp = head ;
        for(int i = 0 ; i<size-n ; i++){
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
        return head ;
    }
}