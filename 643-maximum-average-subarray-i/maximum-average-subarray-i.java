class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0 ;
        double avg = 0 ;
        double max = 0 ;
        int i = 0 ;
        int j = 0 ;

        while(j< nums.length && j< k){
            sum += nums[j] ;
            j++ ;
        }
        avg = sum / k ;
        max = avg ;
        while(j< nums.length){
            sum = sum + nums[j] - nums[i] ;
            i++ ;
            j++ ;
            avg = sum/k ;
            max = Math.max(max, avg) ;
        }

        return max ;
    }
}