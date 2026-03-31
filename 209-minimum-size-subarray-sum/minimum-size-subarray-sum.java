class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = 0 ;
        int sum = 0 ;
        int min = Integer.MAX_VALUE ;
        boolean flag = false ;

        for(int i = 0 ; i < nums.length ; i++){
            
                sum += nums[i] ;
                count++ ;

                while(sum >= target){
                    min = Math.min(min, count) ;
                    flag = true ;

                    sum -= nums[i - count + 1] ;
                    count-- ;
                    
                   
                }
            
        }
        
        if(flag == true){
            return min ;
        }

        return 0 ;

    }
}