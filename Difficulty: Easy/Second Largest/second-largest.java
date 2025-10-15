class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = 0 ;
        int n = arr.length ;
        for(int i = 1 ; i< n; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        int m = arr[max] ;
        for(int i = 0 ; i< n; i++){
            if(arr[i] == m){
                arr[i] = Integer.MIN_VALUE ;
            }
        }
        max = arr[0] ;
        for(int i = 1 ; i< n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        if(max>-1){
            return max ;
        }
        return -1 ;
    }
}