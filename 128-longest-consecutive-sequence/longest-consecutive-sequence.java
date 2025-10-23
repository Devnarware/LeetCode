class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length ;
        if(n == 0 || n == 1){
            return n ;
        }
        Arrays.sort(arr) ;
        int count = 1 ;
        int max = 1 ;
        int lastSmallest = arr[0] ;
        for(int i = 1 ; i<n ; i++){
            if(arr[i] == lastSmallest+1){
                count++ ;
                lastSmallest = arr[i] ;
            }else if(arr[i] != lastSmallest){
                count = 1 ;
                lastSmallest = arr[i] ;
            }
            max = Math.max(max , count) ;
        }
        return max ;
    }
}