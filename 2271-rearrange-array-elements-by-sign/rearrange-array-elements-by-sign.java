class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length ;
        int[] pos = new int[n/2] ;
        int[] neg = new int[n/2] ;
        int i = 0 , j = 0 ,  k = 0;
        while(k<n){
            if(nums[k] < 0 ){
                neg[i] = nums[k] ;
                i++ ;
            }else{
                pos[j] = nums[k] ;
                j++ ;
            }
            k++ ;
        }
        i = 0 ;
        j = 0 ;
        int[] arr = new int[n] ;
        while(i<n){
            arr[i] = pos[j] ;
            i++ ;
            arr[i] = neg[j] ;
            j++ ;
            i++ ;
        }
        return arr ;

    }
}