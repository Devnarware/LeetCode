class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow = 0 ;
        int fast = 0 ;

        // it gives the point where slow and fast meet or coinfirms that there is a loop


        do{
            slow = nums[slow] ;
            fast = nums[nums[fast]] ;

        }while(slow != fast) ;

        slow = 0 ;
        while(slow != fast){
            slow = nums[slow] ;
            fast = nums[fast] ;

        }

        return slow ;
    }
}