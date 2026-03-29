/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number}
 */
var pairSum = function(head) {
    
    let slow = head 
    let fast = head 


// 1. calculating mid of the LL
    while(fast != null){
        slow = slow.next
        fast = fast.next.next
    }

// 2. reverse the mid part

    let head2 = reverse(slow)


// 3. Calculating maximum

    let max = -Infinity

    while(head2 != null){
        let currSum = head.val + head2.val

        if(max < currSum){
            max = currSum
        }

        head = head.next
        head2 = head2.next

    }

    return max



};

var reverse = function(head){
    let prev = null 

    while(head != null){
        let curr = head
        head = head.next 
        curr.next = prev
        prev = curr 
    }

    return prev
};