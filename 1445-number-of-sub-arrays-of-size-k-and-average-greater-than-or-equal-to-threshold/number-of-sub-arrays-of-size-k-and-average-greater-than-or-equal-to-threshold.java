class Solution {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        double avg = 0 ;
        int count = 0 ;
        int sum = 0 ;
        int i = 0 ;
        int j = 0 ;

        while(j < k){
            sum += arr[j] ;
            j++ ;
        }
        avg =  (double)(sum/k) ;

        while(j<arr.length){
            if(avg >= threshold){
                count++ ;
            }
            sum = sum + arr[j] - arr[i] ;
            avg = (double)(sum/k) ;
            i++ ;
            j++ ;

        }

        if(avg >= threshold){
            count++ ;
        }


        return count ;

    }
}