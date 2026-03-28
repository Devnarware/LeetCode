/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func isPalindrome(head *ListNode) bool {

    
    // 1. break from middle
    slow := head 
    fast := head
    // var prev ListNode

    for fast != nil && fast.Next != nil{
        // prev = slow
        slow = slow.Next
        fast = fast.Next.Next
    }

    // 2. reverse from the middle 

    head2 := reverse(slow)

    // 3. comapre
    i := head
    j := head2

    for i != head2 && j != nil{
        if i.Val != j.Val{
            return false 
        }
        i = i.Next
        j = j.Next
    }

    return true
    
}

func reverse(head *ListNode) *ListNode{
    var prev *ListNode 

    for head != nil {
        curr := head 
        head = head.Next
        curr.Next = prev
        prev = curr
    }

    return prev
}