class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length ;
        int largest = nums[n-1] ;
        if(target > largest){
            return n ;
        }
        else{
            for(int i = 0 ; i<nums.length ; i++){
                if(target<=nums[i]){
                    return i ; 
                }
            }
        }
        return 0 ;
    }
}