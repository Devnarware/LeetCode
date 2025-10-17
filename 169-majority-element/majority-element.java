class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums) ;
        int count = 0 ;
        int max = 0 ;
        int major = nums[0] ;
        int curr = nums[0] ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] ==curr){
                count++ ;
            }
            else{
                curr = nums[i] ;
                if(count>max){
                    max = count ;
                    major = nums[i-1] ;
                }
                count = 1 ;
            }
        }
        if(count>max){
            max = count ;
            major = nums[nums.length-1] ;
        }
        return major ;
    }
}