class Solution {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0 ;
        int sum = 0 ;
        int target = threshold * k ; // ← no division needed now!

        for(int j = 0 ; j < arr.length ; j++){
            sum += arr[j] ;

            if(j >= k - 1){              
                if(sum >= target){       
                    count++ ;
                }
                sum -= arr[j - k + 1] ; 
            }
        }

        return count ;
    }
}