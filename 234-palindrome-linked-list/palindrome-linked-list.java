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
        int size = 0 ;
        ListNode temp = head ;
        ListNode rightHead ;

        //FINDING SIZE

        while(temp != null){
            size++ ;
            temp = temp.next ;
        }
        if(size == 1){
            return true ;
        }
        //FINDING THE NODE BEFORE MID
        temp = head ;
        int mid = size/2 ;
        for(int i = 0 ; i < mid - 1 ; i++){
            temp = temp.next ;
        }

        //BREAKING THE NODE FROM THE MID ACC TO EVEN-ODD

        if(size % 2 == 0 ){
            rightHead = temp.next ;
            temp.next = null ;
        }else{
            rightHead = temp.next.next ;
            temp.next = null ;
        }


        //REVERSE THE RIGHT PART OF THER NODE

        rightHead = reverse(rightHead) ;


        //CHECKING IF PALINDROME OR NOT

        while(head != null){
            if(head.val != rightHead.val){
                return false ;
            }
            rightHead = rightHead.next ;
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