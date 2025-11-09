class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1} ;
        ans[0] = binarySearch(nums, target, true) ;
        ans[1] = binarySearch(nums, target, false) ; ;
        return ans ;
    }

    public static int binarySearch(int[] arr , int target , boolean isleft){
        int n = arr.length ;
        int s = 0 ;
        int e = n - 1 ;
        int ans = -1 ;
        while(s<=e){

            int m = s + (e-s)/2 ;
            if(arr[m] == target){
                if(isleft){
                    ans = m ;
                    e = m-1 ;
                }else{
                    ans = m ;
                    s = m+1 ;
                }
            }else if(arr[m]>target){
                e = m-1 ;
            }else{
                s = m+1 ;
            }
        }
        return ans ;
    }
}