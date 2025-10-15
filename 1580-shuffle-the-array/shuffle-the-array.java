class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n] ;
        int i = 0 , k = 0 ;
        int j = n ;
        while(i<n){
            arr[k] = nums[i] ;
            i++;
            k++ ;
            arr[k] = nums[j] ;
            j++ ;
            k++ ;
        }
        return arr ;
    }
}