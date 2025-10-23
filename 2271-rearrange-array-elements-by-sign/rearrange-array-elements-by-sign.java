class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length ;
        int posIdx = 0 ;
        int negIdx = 1 ;
        int[] arr = new int[n] ;
        for(int i = 0 ; i<n ; i++){
            if(nums[i]>0){
                arr[posIdx] = nums[i] ;
                posIdx += 2 ;
            }else{
                arr[negIdx] = nums[i] ;
                negIdx += 2 ;
            }
        }
        return arr ;

    }
}