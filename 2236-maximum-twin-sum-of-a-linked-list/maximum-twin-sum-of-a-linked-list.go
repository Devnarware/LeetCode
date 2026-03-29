/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func pairSum(head *ListNode) int {
    
    slow := head
    fast := head


    // 1. Finding Mid
    for fast != nil{
        slow = slow.Next
        fast = fast.Next.Next
    }

    // 2. Reverse the Other half

    head2 := reverse(slow) 

    // 3. Claculate Sum

    max := math.MinInt32 

    for head2 != nil{
        curr := head.Val + head2.Val

       if max < curr {

          max = curr
       }

       head = head.Next
       head2 = head2.Next
    }


    return max 

}


func reverse(head *ListNode) *ListNode{
    var prev *ListNode

    for head != nil{
        curr := head
        head = head.Next 
        curr.Next = prev 
        prev = curr
    }

    return prev
}