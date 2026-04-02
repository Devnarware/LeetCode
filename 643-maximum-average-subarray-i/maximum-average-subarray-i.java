class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(k>nums.length){
            return 0.0 ;
        }
        int sum = 0 ;
        // double avg = 0 ;
        int max = 0 ;
        int i = 0 ;
        int j = 0 ;

        while(j< nums.length && j< k){
            sum += nums[j] ;
            j++ ;
        }
        // avg = sum / k ;
        max = sum ;
        while(j< nums.length){
            sum = sum + nums[j] - nums[i] ;
            i++ ;
            j++ ;
            // avg = sum/k ;
            max = Math.max(max, sum) ;
        }

        return (double)max/k ;
    }
}